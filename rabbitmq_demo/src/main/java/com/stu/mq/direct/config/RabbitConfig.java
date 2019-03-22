package com.stu.mq.direct.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	
	@Bean
    public Queue Queue() {
        return new Queue("hello");
    }
	


}
