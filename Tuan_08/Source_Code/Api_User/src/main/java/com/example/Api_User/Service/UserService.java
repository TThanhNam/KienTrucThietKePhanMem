package com.example.Api_User.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api_User.Entity.NguoiDung;
import com.example.Api_User.resposotory.UserRespository;

@Service
public class UserService {
	@Autowired
	private UserRespository userRespository;

	public List<NguoiDung> findAll() {
		return userRespository.findAll();
	}
	
	
}
