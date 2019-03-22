package com.stu.mq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stu.mq.fanout.config.RabbitFanoutConfig;

@Component
public class FanoutSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void sendFanout(Object message) {
		System.out.println("begin send fanout message<" + message + ">");
		rabbitTemplate.convertAndSend(RabbitFanoutConfig.EXCHANGE_NAME, "", message);
	}

}
