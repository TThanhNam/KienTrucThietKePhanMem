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
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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

	@Override
	public String toString() {
		return "MayBay [maMayBay=" + maMayBay + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}
	
	
}
