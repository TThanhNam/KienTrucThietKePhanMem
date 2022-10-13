package com.example.SpringBoot_ActiveMQ.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public String sendName(String name) {
		jmsTemplate.convertAndSend("ThanhNam",name);
		return name;
	}
}
