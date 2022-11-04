package com.example.Api_Department.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api_Department.Entity.Phong;
import com.example.Api_Department.Respository.DepartmentRespository;


@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRespository departmentRespository;
	
	public List<Phong> findAll() {
		return departmentRespository.findAll();
	}
	
	
}
