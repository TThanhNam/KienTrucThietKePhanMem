package com.example.SpringDataAPI_QuanLyChuyenBay.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.MayBay;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.MayBayRepository;

@Service
public class MayBayServerImpl {
	
	@Autowired
	MayBayRepository mayBayRepository;

	public List<MayBay> mayBayTamBayLonHon1000() {
		return mayBayRepository.mayBayTamBayLonHon1000();
	}

	public int soLuongMayBayBoeing() {
		return mayBayRepository.soLuongMayBayBoeing();
	}

	public List<String> mayBayNhanVienHoNguyenCoTheLai() {
		return mayBayRepository.mayBayNhanVienHoNguyenCoTheLai();
	}
	
	
}
