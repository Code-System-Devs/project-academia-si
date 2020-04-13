package com.academiasi.spring.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HorariosIndex {
	
	@Autowired
	
	
	
	@RequestMapping(value="/listar-horarios", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Horarios");
		model.addAttribute("titulo1", "Horarios");
		model.addAttribute("horarios", horarioService.findAll());
		return "listar-horarios";
	}

}
