package com.sample.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.service.MateService;
import com.sample.web.view.Mate;
import com.sample.web.view.Performance;

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
	public String matedetail() {
		
		return "mate/matedetail";
	}
	@GetMapping("/mates.do")
	@ResponseBody
	public List<Mate> mates(@RequestParam("perid") int performanceId){
		
		return mateService.getMatesByPerformanceId(performanceId);
	}
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
	
}
