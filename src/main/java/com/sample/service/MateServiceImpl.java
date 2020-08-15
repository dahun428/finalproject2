package com.sample.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.MateDao;
import com.sample.web.view.Mate;
import com.sample.web.view.MateTimeLine;
import com.sample.web.view.User;

@Service
public class MateServiceImpl implements MateService {
	

	@Autowired
	MateDao mateDao;
	
	
	public static void main(String[] args) {
	
	}
	
	public void addHashTag(int mateId, List<String> mateTags) {

	}
	
	@Override
	public void addMate(Mate mate) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addMateMember(int mateId, User newMember) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void changeCategory(int mateId, String category) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Mate getMateById(int mateId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Mate> getMatesByPerformanceId(int performanceId) {
		
		return mateDao.getMatesByPerformanceId(performanceId);
	}
	@Override
	public MateTimeLine getMateTimeLineByMateId(int mateId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void insertMateTimeLine(int mateId, MateTimeLine mateTimeLine) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * mate_category 테이블의 모든 카테고리 정보를 가져온다.
	 */
	public List<Map<Integer, String>> getMateAllCategory() {
		return mateDao.getMateAllCategory();
	}
	/**
	 * mate_main 테이블에서 performanceId 에 해당하는 테이블의 숫자를 가져온다.
	 */
	public Integer getCountMateByPerformanceId(int performanceId) {
		return mateDao.getCountMateByPerformanceId(performanceId);
	}
	
}
