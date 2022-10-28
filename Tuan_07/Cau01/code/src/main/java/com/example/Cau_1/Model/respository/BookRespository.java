package com.example.Cau_1.Model.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cau_1.Model.Book;

@Repository
public interface BookRespository extends JpaRepository<Book, Integer>{

}
