package com.stu.mq.direct;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stu.mq.direct.pojo.User;

import net.sf.json.JSONObject;

@Component
public class HelloSender {

	@Autowired
    private AmqpTemplate rabbitTemplate;
 
    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
    
    public void sendUser() {
	    User user=new User();
		user.setName("test");
		user.setPass("123456");	
		JSONObject json = JSONObject.fromObject(user);
		System.out.println("Sender : " + json.toString());
        this.rabbitTemplate.convertAndSend("hello", json.toString());
	
    }

}
