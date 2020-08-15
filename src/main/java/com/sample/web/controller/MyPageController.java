package com.sample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	@RequestMapping("/mypagemain.do")
	public String main() {
		return "mypage/mypagemain";
	}
	@RequestMapping("/myperformance.do")
	public String myPerformance() {
		return "mypage/myperformance";
	}
	@RequestMapping("/myperformanceDetail.do")
	public String myPerformanceDetail() {
		return "mypage/myperformanceDetail";
	}
}
