package com.example.SpringDataAPI_QuanLyChuyenBay;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.ChuyenBay;
import com.example.SpringDataAPI_QuanLyChuyenBay.Model.MayBay;
import com.example.SpringDataAPI_QuanLyChuyenBay.Model.NhanVien;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.ChuyenBayRepository;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.MayBayRepository;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.NhanVienRepository;

@SpringBootTest
class SpringDataApiQuanLyChuyenBayApplicationTests {

	@Autowired
	private ChuyenBayRepository ChuyenBayRep;
	
	@Autowired
	private MayBayRepository MayBayRep;
	
	@Autowired
	private NhanVienRepository NhanVienRep;
	
	@Test
	void contextLoads() {
	}
	
	public void ChuyenBayDiDaLat() {
		List<ChuyenBay> ls = ChuyenBayRep.chuyenBayDiDaLat();
		ls.forEach(System.out::println);
	}
	public void MayBayCoTamBayLonHon1000() {
		List<MayBay> ls = MayBayRep.mayBayTamBayLonHon1000();
		ls.forEach(System.out::println);
	}
	
	public void NhanVienCoLuongNhoHon10k() {
		List<NhanVien> ls = NhanVienRep.NhanVienCoLuongNhoHon10k();
		ls.forEach(System.out::println);
	}
	
	public void ChuyenBayCodoDaiNhoHon10000vaLonHon8000() {
		List<ChuyenBay> ls = ChuyenBayRep.chuyenBayCoDoDaiNhoHon10000vaLonHon8000();
		ls.forEach(System.out::println);
	}
	
	public void ChuyenBayXuatPhatSGDiBmt() {
		List<ChuyenBay> ls = ChuyenBayRep.ChuyenBayXuatPhatSGToiBMT();
		ls.forEach(System.out::println);
	}
	
	public void SoChuyenBayXuatPhatTuSG() {
		int ls = ChuyenBayRep.soChuyenBayXuatPhatTuSG();
		System.out.println(ls);
	}
	
	public void soLuongMayBayBoeing() {
		int ls = MayBayRep.soLuongMayBayBoeing();
		System.out.println(ls);
	}
	
	public void tongLuongNhanVien() {
		int ls = NhanVienRep.tongLuongNhanVien();
		System.out.println(ls);
	}
	
	public void maSoPhiCongLaiBoeing() {
		List<String> ls = NhanVienRep.maSoPhiCongLaiBoeing();
		ls.forEach(System.out::println);
	}
	public void nhanVienLaiMayBay747() {
		List<NhanVien> ls = NhanVienRep.nhanVienLaiMayBay747();
		ls.forEach(System.out::println);
	}

	public void mayBayNhanVienHoNguyenCoTheLai() {
		List<String> ls = MayBayRep.mayBayNhanVienHoNguyenCoTheLai();
		ls.forEach(System.out::println);
	}
}
