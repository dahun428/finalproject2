package com.sample.dao;

import java.util.List;

import com.sample.dto.PerformanceDetailDto;


public interface PerformanceDao {
    
	//Performance selectPerformance(int id);	
	String[] getGenreById(int id);
	//좌석 정보 테이블 필요
	List<PerformanceDetailDto> getPerformancesByCategory(String category);	
	//String[] getGenreByCategory(String category);
	PerformanceDetailDto getPerformanceById(int id);
}