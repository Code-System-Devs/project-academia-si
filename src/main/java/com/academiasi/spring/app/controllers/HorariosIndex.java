package com.academiasi.spring.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.academiasi.spring.app.models.entities.Horario;
import com.academiasi.spring.app.models.services.IHorarioService;

@Controller
@SessionAttributes("horario")
public class HorariosIndex {
	
	@Autowired
	private IHorarioService horarioService;
	
	@RequestMapping(value="/listar-horarios", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Horarios");
		model.addAttribute("titulo1", "Horarios");
		model.addAttribute("horarios", horarioService.findAll());
		return "listar-horarios";
	}
	
	
	@RequestMapping(value="/form-horarios")
	public String crear(Map<String, Object> model) {
		
		Horario horario = new Horario();
		model.put("horario",horario);
		model.put("titulo", "Formulario de Horario");
		return "form-horarios";
	}
	
	@RequestMapping(value="/form-horarios/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model) {
		
		Horario horario = null;
		
		if(id>0) {
			horario = horarioService.findOne(id);
		} else {
			return "redirect:/listar-horarios";
		}
		model.put("horario", horario);
		model.put("titulo","Editar Horario");
		return "form-horarios";
	}
	
	@RequestMapping(value="/form-horarios", method=RequestMethod.POST)
	public String guardar(@Valid Horario horario, BindingResult result, Model model, SessionStatus status) {
		if(result.hasErrors()) {
			model.addAttribute("titulo","Formulario de Horario");
			return"form-horarios";
		}
		
		horarioService.save(horario);
		status.setComplete();
		return"redirect:listar-horarios";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		
		if(id>0) {
			horarioService.delete(id);
		}
		
		return "redirect:/listar-horarios";
	}

	
}
