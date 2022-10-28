package com.example.Cau_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.example.Cau_2.Model.Book;

@Component
public class sendService {
	@Autowired
	private JmsTemplate jTemplate;

	public void SendProduct(Book b) {
		jTemplate.convertAndSend("ThanhNam", b);
		System.out.println("Send secesfull : " + b.toString());
	}

}
