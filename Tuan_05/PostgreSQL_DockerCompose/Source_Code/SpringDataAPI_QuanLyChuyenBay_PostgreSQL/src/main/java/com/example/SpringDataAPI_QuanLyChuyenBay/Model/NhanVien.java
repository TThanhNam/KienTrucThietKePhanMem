package com.example.SpringDataAPI_QuanLyChuyenBay.Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "nhanvien")
public class NhanVien implements Serializable{

	@Id
	@Column(name = "MaNV")
	private String maNhanVien;
	
	private int luong;
	
	private String tenNhanVien;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanVien")
	private Set<ChungNhan> lsChungNhan = new HashSet<>();
	
	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}


	public NhanVien(String maNhanVien, int luong, String tenNhanVien, Set<ChungNhan> lsChungNhan) {
		super();
		this.maNhanVien = maNhanVien;
		this.luong = luong;
		this.tenNhanVien = tenNhanVien;
		this.lsChungNhan = lsChungNhan;
	}

	public NhanVien() {
		super();
	}

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", luong=" + luong + ", tenNhanVien=" + tenNhanVien + "]";
	}
	
	
}
