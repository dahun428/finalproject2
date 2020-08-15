package com.sample.service;

import java.util.List;

import com.sample.dto.PerformanceDetailDto;
import com.sample.web.view.Performance;

public interface PerformanceService {
    void addPerformance(Performance performance);
    List<PerformanceDetailDto> getPerformancesByCategory(String category);	// 파라미터에 category추가
    PerformanceDetailDto getPerformanceDetailById(int performanceId);
    //List<PerformanceDetailDto> searchPerformances(Performance performance);
    //Performance getPerformanceDetail(int performanceId);
    
    
    
}