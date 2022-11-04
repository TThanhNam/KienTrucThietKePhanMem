package com.example.Api_User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api_User.Entity.NguoiDung;
import com.example.Api_User.Service.UserService;

@RestController
@RequestMapping("user")
public class controller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	private List<NguoiDung> pub() {
		// TODO Auto-generated method stub
		return userService.findAll();
	}
}
