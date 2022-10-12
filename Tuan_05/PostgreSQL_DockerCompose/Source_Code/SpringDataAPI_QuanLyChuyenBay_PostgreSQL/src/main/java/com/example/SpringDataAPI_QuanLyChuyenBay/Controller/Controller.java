package com.example.SpringDataAPI_QuanLyChuyenBay.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.ChuyenBay;
import com.example.SpringDataAPI_QuanLyChuyenBay.Model.MayBay;
import com.example.SpringDataAPI_QuanLyChuyenBay.Model.NhanVien;
import com.example.SpringDataAPI_QuanLyChuyenBay.Respository.MayBayRepository;
import com.example.SpringDataAPI_QuanLyChuyenBay.Server.ChuyenBayServerImpl;
import com.example.SpringDataAPI_QuanLyChuyenBay.Server.MayBayServerImpl;
import com.example.SpringDataAPI_QuanLyChuyenBay.Server.NhanVienServerImpl;

@RestController
public class Controller {
	
	@Autowired
	private ChuyenBayServerImpl chuyenBayServerImpl;
	
	@Autowired
	private MayBayServerImpl mayBayServerImpl;
	
	@Autowired
	private NhanVienServerImpl nhanVienServerImpl;
	
	//	1.	Cho biết các chuyến bay đi Đà Lạt (DAD).
	@GetMapping("/cau1")
	public List<ChuyenBay> cau1(){
		System.out.println(chuyenBayServerImpl.chuyenBayDiDaLat());
		return chuyenBayServerImpl.chuyenBayDiDaLat();
	}
	
	//	2.	Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@GetMapping("/cau2")
	public List<MayBay> cau2(){
		return mayBayServerImpl.mayBayTamBayLonHon1000();
	}
	
	//	3.	Tìm các nhân viên có lương nhỏ hơn 10,000.
	@GetMapping("/cau3")
	public List<NhanVien> cau3() {
		return nhanVienServerImpl.NhanVienCoLuongNhoHon10k();
	}
	
	//	4.	Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	@GetMapping("/cau4")
	public List<ChuyenBay> cau4() {
		return chuyenBayServerImpl.chuyenBayCoDoDaiNhoHon10000vaLonHon8000();
	}
	//	5.	Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@GetMapping("/cau5")
	public List<ChuyenBay> cau5() {
		return chuyenBayServerImpl.ChuyenBayXuatPhatSGToiBMT();
	}
	//	6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@GetMapping("/cau6")
	public String cau6() {
		return "Số chuyến bay xuất phát từ SG : " + chuyenBayServerImpl.soChuyenBayXuatPhatTuSG();
	}
	//	7.	Có bao nhiêu loại máy báy Boeing.
	@GetMapping("/cau7")
	public String cau7() {
		return "Số máy bay Boeing : " + mayBayServerImpl.soLuongMayBayBoeing();
	}
	//	8.	Cho biết tổng số lương phải trả cho các nhân viên.
	@GetMapping("/cau8")
	public String cau8() {
		return "Tổng lương phải trả cho nhân viên : " + nhanVienServerImpl.tongLuongNhanVien();
	}
	//	9.	Cho biết mã số của các phi công lái máy báy Boeing.
	@GetMapping("/cau9")
	public List<String> cau9() {
		return nhanVienServerImpl.maSoPhiCongLaiBoeing();
	}
	//	10.	Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@GetMapping("/cau10")
	public List<NhanVien> cau10() {
		return nhanVienServerImpl.nhanVienLaiMayBay747();
	}
	//	11.	Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@GetMapping("/cau11")
	public List<String> cau11() {
		return mayBayServerImpl.mayBayNhanVienHoNguyenCoTheLai();
	}
	//	12.	Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@GetMapping("/cau12")
    private List<String> cau12() {
			return nhanVienServerImpl.maSoPhiCongLaiBoeing();
	}
	//	13.	Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
	//	14.	Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.
	//	15.	Cho biết tên của các phi công lái máy bay Boeing.
	//	16.	Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể 
}