package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dao.PerformanceDao;
import com.sample.dto.PerformanceDetailDto;
import com.sample.web.view.Performance;

@Service
@Transactional
public class PerformanceServiceImpl implements PerformanceService {
	
	@Autowired
	PerformanceDao performanceDao;

	@Override
	public void addPerformance(Performance performance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PerformanceDetailDto> getPerformancesByCategory(String category) {
		// TODO Auto-generated method stub
		
		return performanceDao.getPerformancesByCategory(category);
	}

	@Override
	public PerformanceDetailDto getPerformanceDetailById(int performanceId) {
		// TODO Auto-generated method stub
		return performanceDao.getPerformanceById(performanceId);
	}

	
	
	
}
