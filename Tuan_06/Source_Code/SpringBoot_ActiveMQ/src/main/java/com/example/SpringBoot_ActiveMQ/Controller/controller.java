package com.example.SpringBoot_ActiveMQ.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_ActiveMQ.Service.ListenService;
import com.example.SpringBoot_ActiveMQ.Service.SendService;

@RestController
public class controller {
	
	@Autowired
	private SendService sendService;
	
	private ListenService listenService;
	
	@GetMapping("/Send/{name}")
	public String sendMess(@PathVariable("name") String name) {
		return sendService.sendName(name);
	}
}
