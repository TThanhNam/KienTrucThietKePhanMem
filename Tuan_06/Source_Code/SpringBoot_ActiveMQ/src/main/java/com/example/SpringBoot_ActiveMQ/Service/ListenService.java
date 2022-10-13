package com.example.SpringBoot_ActiveMQ.Service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ListenService {

	@JmsListener(destination = "ThanhNam")
	public void listener(String name) {
		System.out.println("Nhận Được : " + name);
	}
}
