package com.stu.mq.fanout.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitFanoutConfig {
	public static final String EXCHANGE_NAME = "fanout-exchange";
	  public static final String FANOUT_A = "fanout.A";
	  public static final String FANOUT_B = "fanout.B";
	  public static final String FANOUT_C = "fanout.C";
	 
	  @Bean
	  public Queue AMessage() {
	    return new Queue(FANOUT_A);
	  }
	 
	  @Bean
	  public Queue BMessage() {
	    return new Queue(FANOUT_B);
	  }
	 
	  @Bean
	  public Queue CMessage() {
	    return new Queue(FANOUT_C);
	  }
	 
	  @Bean
	  public FanoutExchange fanoutExchange() {
	    return new FanoutExchange(EXCHANGE_NAME);
	  }
	 
	  @Bean
	  public Binding bindingExchangeA(Queue AMessage, FanoutExchange fanoutExchange) {
	    return BindingBuilder.bind(AMessage).to(fanoutExchange);
	  }
	 
	  @Bean
	  public Binding bindingExchangeB(Queue BMessage, FanoutExchange fanoutExchange) {
	    return BindingBuilder.bind(BMessage).to(fanoutExchange);
	  }
	 
	  @Bean
	  public Binding bindingExchangeC(Queue CMessage, FanoutExchange fanoutExchange) {
	    return BindingBuilder.bind(CMessage).to(fanoutExchange);
	  }

}
