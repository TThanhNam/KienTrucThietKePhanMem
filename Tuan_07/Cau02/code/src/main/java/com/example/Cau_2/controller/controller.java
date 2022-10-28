package com.example.Cau_2.controller;



import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Cau_2.Model.Book;
import com.example.Cau_2.service.listtenService;
import com.example.Cau_2.service.sendService;




@RestController
public class controller implements Serializable{
	
	@Autowired
	private sendService sendService;
	
	@Autowired
	private listtenService listtenService;
	
	@PostMapping("/app2create")
	private Book createB(@RequestBody Book s) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/create";
		
		HttpEntity<Book> request = new HttpEntity<>(s);
		Book foo = restTemplate.postForObject(fooResourceUrl, request, Book.class);

		return s;
	}
	
	@GetMapping("/cau2find/{id}")
	private Book findIdB(@PathVariable int id) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/get";
		ResponseEntity<Book> sb = restTemplate.getForEntity(fooResourceUrl + "/" + id, Book.class);
		return sb.getBody();
	}
	
	@PostMapping("/send")
	private Book send(@RequestBody Book b) {
		// TODO Auto-generated method stub
		sendService.SendProduct(b);
		return b;
	}
	
	@GetMapping("/receive")
	private Book receive() {
		// TODO Auto-generated method stub
		return listtenService.receiveBook();
	}
	
}
