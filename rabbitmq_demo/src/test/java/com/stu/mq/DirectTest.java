package com.stu.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stu.mq.direct.HelloSender;
import com.stu.mq.fanout.FanoutSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectTest {
	
	@Autowired
    private HelloSender helloSender;
	
	
 
    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
    
    @Test
    public void user() throws Exception {
        helloSender.sendUser();
    }
    
   

}
