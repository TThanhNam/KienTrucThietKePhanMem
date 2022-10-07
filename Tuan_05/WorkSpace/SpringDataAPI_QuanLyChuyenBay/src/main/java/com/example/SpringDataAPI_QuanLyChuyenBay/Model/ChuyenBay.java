package com.example.SpringDataAPI_QuanLyChuyenBay.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable{
	
	@Id
	private String maCB;
	
	private String gaDi;

	private String gaDen;
	
	private int doDai;	

	private Date gioDi;
	
	private Date gioDen;	

	private int chiPhi;

	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
		
	
}
