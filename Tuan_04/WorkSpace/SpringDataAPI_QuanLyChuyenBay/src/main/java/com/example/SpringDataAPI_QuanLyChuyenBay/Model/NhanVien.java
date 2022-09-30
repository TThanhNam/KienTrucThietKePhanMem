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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nhanvien")
public class NhanVien implements Serializable{

	@Id
	@Column(name = "MaNV")
	private String maNhanVien;
	
	private int luong;
	
	private String tenNhanVien;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanVien")
	private Set<ChungNhan> lsChungNhan = new HashSet<>();

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", luong=" + luong + ", tenNhanVien=" + tenNhanVien + "]";
	}
	
	
}
