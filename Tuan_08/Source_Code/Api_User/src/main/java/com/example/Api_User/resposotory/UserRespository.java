package com.example.Api_User.resposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Api_User.Entity.NguoiDung;

@Repository
public interface UserRespository extends JpaRepository<NguoiDung, Integer>{

}
