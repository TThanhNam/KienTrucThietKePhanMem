package com.example.Cau_1.Model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Cau_1.Model.Book;
import com.example.Cau_1.Model.respository.BookRespository;

@Component
public class BookService {
	
	@Autowired
	private BookRespository bookRespository;
	
	public Book create(Book b) {
		return bookRespository.save(b);
	}

	public List<Book> findAll() {
		return bookRespository.findAll();
	}
	
	public Book findOne(int id) {
		List<Book> ls = findAll();
		for (Book book : ls) {
			if(book.getSibId() == id)
				return book;
		}
		return null;
	}
	
}
