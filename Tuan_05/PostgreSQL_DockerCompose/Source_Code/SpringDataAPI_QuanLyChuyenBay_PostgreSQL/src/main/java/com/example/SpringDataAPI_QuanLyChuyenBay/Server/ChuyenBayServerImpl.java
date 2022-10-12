package com.example.SpringDataAPI_QuanLyChuyenBay.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.ChuyenBay;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.ChuyenBayRepository;

@Service
public class ChuyenBayServerImpl {
	
	@Autowired
	ChuyenBayRepository chuyenBayRepository;

	public List<ChuyenBay> chuyenBayDiDaLat() {
		return chuyenBayRepository.chuyenBayDiDaLat();
	}

	public List<ChuyenBay> chuyenBayCoDoDaiNhoHon10000vaLonHon8000() {
		return chuyenBayRepository.chuyenBayCoDoDaiNhoHon10000vaLonHon8000();
	}

	public List<ChuyenBay> ChuyenBayXuatPhatSGToiBMT() {
		return chuyenBayRepository.ChuyenBayXuatPhatSGToiBMT();
	}

	public int soChuyenBayXuatPhatTuSG() {
		return chuyenBayRepository.soChuyenBayXuatPhatTuSG();
	}

}
