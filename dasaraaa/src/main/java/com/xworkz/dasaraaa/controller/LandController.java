package com.xworkz.dasaraaa.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LandController {
	
	public LandController() {
		System.out.println("running landcontroller"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/start.do")
	public String onClick() {
		System.out.println("on click running");
		return "index.jsp";
	}

}
