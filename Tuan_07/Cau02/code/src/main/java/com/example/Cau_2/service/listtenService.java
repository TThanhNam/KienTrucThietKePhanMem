package com.example.Cau_2.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.Cau_2.Model.Book;

@Component
public class listtenService {
	
	Book b = null;
	@JmsListener(destination = "ThanhNam")
	public void receive(Book b) {
		this.b = b;
	}
	
	public Book receiveBook() {
		return b;
	}
}
