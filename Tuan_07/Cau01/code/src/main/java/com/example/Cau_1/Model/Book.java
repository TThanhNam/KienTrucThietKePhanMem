package com.example.Cau_1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int sibid;
	private String name;
	private String credit;
	public Book() {
		super();
	}
	public Book(int sibId, String name, String credit) {
		super();
		this.sibid = sibId;
		this.name = name;
		this.credit = credit;
	}
	public int getSibId() {
		return sibid;
	}
	public void setSibId(int sibId) {
		this.sibid = sibId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Book [sibId=" + sibid + ", name=" + name + ", credit=" + credit + "]";
	}
	
	
}
