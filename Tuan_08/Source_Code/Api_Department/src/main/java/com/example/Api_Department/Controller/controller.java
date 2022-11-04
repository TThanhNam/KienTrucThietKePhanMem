package com.example.Api_Department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api_Department.Entity.Phong;
import com.example.Api_Department.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class controller {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/all")
	private List<Phong> pub() {
		return departmentService.findAll();
	}

}
