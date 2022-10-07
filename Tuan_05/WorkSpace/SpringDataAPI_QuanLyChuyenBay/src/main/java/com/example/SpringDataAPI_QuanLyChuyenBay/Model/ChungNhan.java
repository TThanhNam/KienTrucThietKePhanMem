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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chungnhan")
public class ChungNhan implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNV", nullable = false, referencedColumnName = "MaNV")
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMB", nullable = false, referencedColumnName = "MaMB")
	private MayBay mayBay;

	@Override
	public String toString() {
		return "ChungNhan [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}
	
	
}
