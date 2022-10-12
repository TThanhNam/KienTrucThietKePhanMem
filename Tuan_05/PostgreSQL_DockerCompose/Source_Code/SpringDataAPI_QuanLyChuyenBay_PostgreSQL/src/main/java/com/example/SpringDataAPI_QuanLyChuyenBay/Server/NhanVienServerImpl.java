package com.example.SpringDataAPI_QuanLyChuyenBay.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.NhanVien;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.NhanVienRepository;

@Service
public class NhanVienServerImpl {
	
	@Autowired
	private NhanVienRepository nhanVienRepository;

	public List<NhanVien> NhanVienCoLuongNhoHon10k() {
		return nhanVienRepository.NhanVienCoLuongNhoHon10k();
	}

	public int tongLuongNhanVien() {
		return nhanVienRepository.tongLuongNhanVien();
	}

	public List<String> maSoPhiCongLaiBoeing() {
		return nhanVienRepository.maSoPhiCongLaiBoeing();
	}

	public List<NhanVien> nhanVienLaiMayBay747() {
		return nhanVienRepository.nhanVienLaiMayBay747();
	}
	
	public List<String> phiCongVuaLaiBoeingVaAirbus() {
		return nhanVienRepository.phiCongVuaLaiBoeingVaAirbus();
	}
	
}
