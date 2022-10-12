package com.example.SpringDataAPI_QuanLyChuyenBay.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	
	@Query(value = "SELECT * FROM maybay WHERE tam_bay > 1000", nativeQuery = true)
	public List<MayBay> mayBayTamBayLonHon1000();
	
	@Query(value = "SELECT COUNT(*) FROM maybay WHERE loai like 'Boeing%'", nativeQuery = true)
	public int soLuongMayBayBoeing();
	
	@Query(value = "SELECT mb.mamb FROM maybay  as mb \r\n"
			+ "join chungnhan as cn on mb.mamb = cn.mamb\r\n"
			+ "join nhanvien as nv on cn.manv = nv.manv\r\n"
			+ "WHERE nv.ten_nhan_vien like 'Nguyen%'", nativeQuery = true)
	public List<String> mayBayNhanVienHoNguyenCoTheLai();
	
	
}
