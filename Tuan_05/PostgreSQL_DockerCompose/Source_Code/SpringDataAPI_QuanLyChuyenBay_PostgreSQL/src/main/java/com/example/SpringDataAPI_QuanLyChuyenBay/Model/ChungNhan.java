package com.example.SpringDataAPI_QuanLyChuyenBay.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNV", nullable = false)
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMB", nullable = false)
	private MayBay mayBay;

	@Override
	public String toString() {
		return "ChungNhan [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}

	public ChungNhan() {
		super();
	}

	public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
		super();
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public MayBay getMayBay() {
		return mayBay;
	}

	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}
	
	
}
