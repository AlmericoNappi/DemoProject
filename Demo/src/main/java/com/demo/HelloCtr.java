package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/helloctr")
public class HelloCtr {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello( ) {
		System.out.println("dentro");
		return "ciao ombra";
	}

}
