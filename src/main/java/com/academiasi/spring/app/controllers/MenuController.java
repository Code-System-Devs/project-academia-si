package com.academiasi.spring.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

	
	@GetMapping({"/menu"})
	public String Menu() {
		return"menu";
	}
}