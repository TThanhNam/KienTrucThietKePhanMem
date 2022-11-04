package com.example.Api_User.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NguoiDung{
	@Id
	private int id;
	private String name;
	
	public NguoiDung() {
		super();
	}
	public NguoiDung(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
