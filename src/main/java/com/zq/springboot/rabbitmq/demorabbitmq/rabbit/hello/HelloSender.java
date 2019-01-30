package com.zq.springboot.rabbitmq.demorabbitmq.rabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


//发送者
@Component
public class HelloSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;//AmqpTemplate 是 Spring Boot 提供的默认实现。

	public void send() {
		String context = "hello " + new Date();
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("hello", context);
	}

}