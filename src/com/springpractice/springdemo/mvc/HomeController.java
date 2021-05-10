package com.springpractice.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")  // to attach this path to given method
	public String showPage() {
		return "main-menu";
	}

}
