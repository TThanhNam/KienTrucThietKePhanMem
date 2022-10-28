package com.example.Cau_1.Model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cau_1.Model.Book;
import com.example.Cau_1.Model.service.BookService;

@RestController
public class controller {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/create")
	private Book creare(@RequestBody Book b) {
		// TODO Auto-generated method stub
		return bookService.create(b);
	}
	
	@GetMapping("/get")
	private List<Book> get() {
		// TODO Auto-generated method stub
		return bookService.findAll();
	}
	
	@GetMapping("/get/{id}")
	private Book get(@PathVariable int id) {
		// TODO Auto-generated method stub
		return bookService.findOne(id);
	}
}
