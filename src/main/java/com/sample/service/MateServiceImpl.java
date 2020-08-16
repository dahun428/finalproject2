package com.sample.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.MateDao;
import com.sample.dao.UserDao;
import com.sample.dto.MateDetailDto;
import com.sample.web.view.Mate;
import com.sample.web.view.MateTimeLine;
import com.sample.web.view.User;

@Service
public class MateServiceImpl implements MateService {
	

	@Autowired
	MateDao mateDao;
	
	@Autowired
	UserDao userDao;
	
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
	public MateDetailDto getMateRoomDetail(int mateId, int performanceId) {
		MateDetailDto matedetail = new MateDetailDto();
		matedetail.setMate(mateDao.getMateRoomByPerformanceIdAndMateId(mateId, performanceId));
		matedetail.setTimeline(mateDao.getMateTimelineByMateId(mateId));
		matedetail.setMateCategory(mateDao.getMateCategoryByMateId(mateId));
		return matedetail;
	}
	public List<User> getMateUserByMateIdAndPerformanceId(int mateId) {

		List<User> users = mateDao.getMateUserByMateId(mateId);
		List<User> newUsers = new ArrayList<>();
		for(User user : users) {
			
			User newUser = mateDao.getUserMateInfoById(user.getId());
			newUsers.add(newUser);
		}
		return newUsers;
	}
	public void addMateTimeLineByMateIdAndUserId(MateTimeLine mateTimeLine) {

		//세션으로부터 userId 여부를 검사한다.
		User user = mateDao.getUserMateInfoById(mateTimeLine.getUser().getId());
		//userDao.getUserById(mateTimeLine.getUser().getId());
		if(user == null) {
			throw new RuntimeException("접근 권한이 없습니다.");
		}
		//mate방이 존재하는지 여부를 검사한다.
		Mate mate = mateDao.getMateByMateId(mateTimeLine.getId());
		if(mate == null) {
			throw new RuntimeException("존재하지 않는 메이트 방입니다.");
		}
		//해당 user가 mate에 소속되어있는지 검사한다.
		List<User> users = mateDao.getMateUserByMateId(mateTimeLine.getId());
		User existUser = null;
		for(User savedUser : users) {
			existUser = mateDao.getUserMateInfoById(savedUser.getId());
		}
		if(existUser == null) {
			throw new RuntimeException("접근 권한이 없습니다.");
		}
		
		//콘텐트를 받아서 mateDao의 메소드를 실행한다.
		mateDao.addTimeLine(mateTimeLine);
	}
	public Map<String, Object> getMateTimeLineCountByMateId(int mateId) {
		List<MateTimeLine> timeLines = mateDao.getMateTimelineByMateId(mateId);
		MateTimeLine time = timeLines.get(timeLines.size() - 1);
		Integer count = mateDao.getMateTimeLineCountByMateId(mateId);
		Map<String, Object> map = new HashMap<>();
		map.put("count", count);
		map.put("time", time);
		return map;
	}
}
