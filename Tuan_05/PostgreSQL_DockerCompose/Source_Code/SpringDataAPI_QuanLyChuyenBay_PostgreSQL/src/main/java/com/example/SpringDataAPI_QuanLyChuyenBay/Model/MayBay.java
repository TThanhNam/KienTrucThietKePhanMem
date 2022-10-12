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

import lombok.Data;

@Entity
@Data
@Table(name = "maybay")
public class MayBay implements Serializable{
	
	@Id
	@Column(name = "MaMB")
	private int maMayBay;
	
	private String loai;

	private int tamBay;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mayBay")
	private Set<ChungNhan> lsChungNhan = new HashSet<>();

	public MayBay(int maMayBay, String loai, int tamBay, Set<ChungNhan> lsChungNhan) {
		super();
		this.maMayBay = maMayBay;
		this.loai = loai;
		this.tamBay = tamBay;
		this.lsChungNhan = lsChungNhan;
	}
	
	public MayBay(int maMayBay, String loai, int tamBay) {
		super();
		this.maMayBay = maMayBay;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public MayBay() {
		super();
	}

	public int getMaMayBay() {
		return maMayBay;
	}

	public void setMaMayBay(int maMayBay) {
		this.maMayBay = maMayBay;
	}

	public String getLoai() {
		return loai;
	}


	public void setLoai(String loai) {
		this.loai = loai;
	}



	public int getTamBay() {
		return tamBay;
	}



	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}

	@Override
	public String toString() {
		return "MayBay [maMayBay=" + maMayBay + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}
	
	
}
