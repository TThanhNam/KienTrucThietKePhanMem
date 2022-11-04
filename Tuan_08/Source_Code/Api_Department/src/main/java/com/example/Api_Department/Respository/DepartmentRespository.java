package com.example.Api_Department.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Api_Department.Entity.Phong;

@Repository
public interface DepartmentRespository extends JpaRepository<Phong, Integer>{
	
}
