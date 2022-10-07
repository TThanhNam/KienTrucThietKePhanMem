package com.example.SpringDataAPI_QuanLyChuyenBay.ChuyenBay;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringDataAPI_QuanLyChuyenBay.Model.ChuyenBay;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

import lombok.val;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
	@Query(value = "SELECT * FROM chuyenbay where ga_den = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> chuyenBayDiDaLat();
	
	@Query(value = "SELECT * FROM [dbo].[chuyenbay] WHERE do_dai < 10000 AND do_dai > 8000", nativeQuery = true)
	public List<ChuyenBay> chuyenBayCoDoDaiNhoHon10000vaLonHon8000();
	
	@Query(value = "SELECT * FROM [dbo].[chuyenbay] WHERE ga_di = 'SGN' AND ga_den = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> ChuyenBayXuatPhatSGToiBMT();
	
	@Query(value = "SELECT COUNT(*) FROM [dbo].[chuyenbay] WHERE ga_di = 'SGN'", nativeQuery = true)
	public int soChuyenBayXuatPhatTuSG();
}
