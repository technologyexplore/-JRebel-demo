package com.stu.mq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSenderAll {
	
	@Autowired
    private AmqpTemplate rabbitTemplate;
	     
	public void send() {
	        String context = "hi, i am messages 2";
	        System.out.println("Sender : " + context);
	        this.rabbitTemplate.convertAndSend("topicExchange", "topic.eee", context);
	    }


}
