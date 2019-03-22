package com.stu.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stu.mq.fanout.FanoutSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FanoutTest {
	
	@Autowired
	FanoutSender fanoutSender;
	
	@Test
    public void fanout() throws Exception {
    	fanoutSender.sendFanout("我在這裡");
    }


}
