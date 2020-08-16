package com.sample.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.dao.MateDao;
import com.sample.dto.MateDetailDto;
import com.sample.service.MateService;
import com.sample.web.view.Mate;
import com.sample.web.view.MateTimeLine;
import com.sample.web.view.Performance;
import com.sample.web.view.User;

@Controller
@RequestMapping("/mate")
public class MateController {

	@Autowired
	MateService mateService;
	
	/**
	 * @return
	 */
	@RequestMapping("/matelist.do")
	public String matelist() {
		
		return "mate/matelist";
	}
	@RequestMapping("/matedetail.do")
	public String matedetail(@RequestParam("pid") int performanceId, 
			@RequestParam("mnum") int mateId, Model model) {
		List<Map<Integer, String>> categories = mateService.getMateAllCategory();
		List<User> users = mateService.getMateUserByMateIdAndPerformanceId(mateId);
		model.addAttribute("mate", users);
		model.addAttribute("pid", performanceId);
		model.addAttribute("mnum", mateId);
		model.addAttribute("categories", categories);
		
		return "mate/matedetail";
	}
//	@GetMapping("/mates.do")
//	@ResponseBody
//	public List<Mate> mates(@RequestParam("perid") int performanceId){
//		
//		return mateService.getMatesByPerformanceId(performanceId);
//	}
	/**
	 * 퍼포먼스 메인 아이디에 해당하는 메이트 방 리스트를 조회한다.
	 * @return
	 */
	@RequestMapping("/mate.do")
	public String mate(@RequestParam("pid") int performanceId, Model model) {
		
		/*
		 * 해당 아이디가 접근 권한이 있는지 체크하기
		 * 유저가 특정 공연을 결제를 완료했으면 접근가능
		 */
		
		
		List<Mate> mates = mateService.getMatesByPerformanceId(performanceId);
		List<Map<Integer, String>> mateCat = mateService.getMateAllCategory();
		Integer mateCount = mateService.getCountMateByPerformanceId(performanceId);
		
		model.addAttribute("mateList", mates);
		model.addAttribute("category", mateCat);
		model.addAttribute("mateCount", mateCount);
		
		return "mate/matelist";
	}
	@RequestMapping("/mateRoom.do")
	@ResponseBody
	public MateDetailDto mateRoom(@RequestParam("pid") int performanceId, 
							@RequestParam("mnum") int mateId, ModelAndView mav) {
		//전부 ajax로 가져온다.
		//메이트 조건 -> 메이트 아이디, 공연 아이디
		//해당 메이트 방의 공연 정보, 유저정보, 메이트 정보, 타임라인 정보를 가져온다.
		//제약조건 : 메이트 방에 해당하는 유저가 있는지 검사한다.
		//제약조건 : 세션값이 있는지 해당하고, 글을 올리는 유저를 검사한다.
		MateDetailDto detail = mateService.getMateRoomDetail(mateId, performanceId);
		return detail;
	}
	@RequestMapping("/mateTimeLine.do")
	@ResponseBody
	public void addTimeLine(@RequestParam("mnum") int mateId, 
							@RequestParam("content") String content,
									HttpSession session) {
		User user = (User) session.getAttribute("LOGIN_USER");
		MateTimeLine mateTimeLine = new MateTimeLine();
		mateTimeLine.setUser(user);
		mateTimeLine.setId(mateId);
		mateTimeLine.setContent(content);
		System.out.println(mateTimeLine);
		mateService.addMateTimeLineByMateIdAndUserId(mateTimeLine);
	}
	@RequestMapping("/mateTimeLineCount.do")
	@ResponseBody
	public Map<String, Object> mateTimeLineCount(@RequestParam("pid") int performanceId, 
			@RequestParam("mnum") int mateId) {
		
		return mateService.getMateTimeLineCountByMateId(mateId);
	}
}
