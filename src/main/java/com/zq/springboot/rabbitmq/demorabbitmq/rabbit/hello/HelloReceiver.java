package com.zq.springboot.rabbitmq.demorabbitmq.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Date;



/*接收者

        注意使用注解@RabbitListener，使用 queues 指明队列名称，@RabbitHandler为具体接收的方法。*/
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process111(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}
