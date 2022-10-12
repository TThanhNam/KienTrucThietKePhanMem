package com.example.SpringDataAPI_QuanLyChuyenBay.Model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable{
	
	@Id
	private String maCB;
	
	private String gaDi;

	private String gaDen;
	
	private int doDai;	

	private Time gioDi;
	
	private Time gioDen;	

	private int chiPhi;

	
	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, Time gioDi, Time gioDen, int chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}


	public ChuyenBay() {
		super();
	}


	public String getMaCB() {
		return maCB;
	}


	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}


	public String getGaDi() {
		return gaDi;
	}


	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}


	public String getGaDen() {
		return gaDen;
	}


	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}


	public int getDoDai() {
		return doDai;
	}


	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}


	public Date getGioDi() {
		return gioDi;
	}


	public void setGioDi(Time gioDi) {
		this.gioDi = gioDi;
	}


	public Date getGioDen() {
		return gioDen;
	}


	public void setGioDen(Time gioDen) {
		this.gioDen = gioDen;
	}


	public int getChiPhi() {
		return chiPhi;
	}


	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}


	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
}
