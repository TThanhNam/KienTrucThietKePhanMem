package com.example.SpringDataAPI_QuanLyChuyenBay.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	@Query(value = "SELECT * FROM nhanvien WHERE luong < 10000", nativeQuery = true)
	public List<NhanVien> NhanVienCoLuongNhoHon10k();
	
	@Query(value = "SELECT SUM(luong) FROM nhanvien", nativeQuery = true)
	public int tongLuongNhanVien();
	
	@Query(value = "SELECT DISTINCT nv.manv FROM maybay  as mb \r\n"
			+ "join chungnhan as cn on mb.mamb = cn.mamb\r\n"
			+ "join nhanvien as nv on cn.manv = nv.manv\r\n"
			+ "WHERE loai like 'Boeing%'", nativeQuery = true)
	public List<String> maSoPhiCongLaiBoeing();
	
	@Query(value = "SELECT nv.manv,nv.luong,nv.ten_nhan_vien FROM maybay as mb\r\n"
			+ "join chungnhan as cn on cn.mamb = mb.mamb\r\n"
			+ "join nhanvien as nv on cn.manv = nv.manv\r\n"
			+ "WHERE mb.mamb = 747",nativeQuery = true)
	public List<NhanVien> nhanVienLaiMayBay747();
	
	@Query(value = "SELECT DISTINCT NV.manv FROM [dbo].[nhanvien] AS NV\r\n"
			+ "JOIN chungnhan AS CN ON NV.manv = CN.manv\r\n"
			+ "JOIN maybay AS MB ON CN.mamb = MB.mamb\r\n"
			+ "WHERE loai like 'Boeing%' AND loai like 'Airbus%'",nativeQuery = true)
	public List<String> phiCongVuaLaiBoeingVaAirbus();
}

