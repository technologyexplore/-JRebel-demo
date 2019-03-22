package com.stu.mq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.stu.mq.fanout.config.RabbitFanoutConfig;
@Component
@RabbitListener(queues = {
		RabbitFanoutConfig.FANOUT_A
})
public class FanoutReceiverA {
	
	@RabbitHandler
	  public void receiveMessage(String message) {
	   System.out.println("A Received <" + message + ">");
	  }

}
