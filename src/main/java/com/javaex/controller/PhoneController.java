package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneController {

	// 필드

	// 생성자

	// 메소드 - GS

	// 메소드 - 일반

	@RequestMapping(value = "/test")
	public String test() {
		System.out.println("test");

		// Front Controller ==> test.jsp 포워드
		return "/WEB-INF/views/test.jsp";
	}

}
