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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.academiasi.spring.app.models.entities.Horario;
import com.academiasi.spring.app.models.services.IHorarioService;

@Controller
@SessionAttributes("horario")
public class HorarioController {
	
	@Autowired
	private IHorarioService horarioService;
	
	@RequestMapping(value="/horarios", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","Horarios");
		model.addAttribute("titulo1","Listado de Horarios Disponibles");
		model.addAttribute("horarios",horarioService.findAll());
		return "listarhorarios";
	}
	
	@RequestMapping(value="/form-horarios")
	public String crear(Map<String, Object> model) {
		
		Horario horario = new Horario();
		model.put("horario",horario);
		model.put("titulo", "Formulario de Horario");
		return "form-horarios";
	}
	
	@RequestMapping(value="/form-horarios/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		
		Horario horario = null;
		
		if(id>0) {
			horario = horarioService.findOne(id);
			if(horario == null) {
				flash.addFlashAttribute("error", "El ID del Horario no existe en la Base de Datos!");
				return "redirect:/horarios";
			}
		} else {
			flash.addFlashAttribute("error", "El ID del Horario no puede ser cero!");
			return "redirect:/horarios";
		}
		model.put("horario", horario);
		model.put("titulo","Editar Horario");
		model.put("titulo1","Formulario para los Horarios");
		return "form-horarios";
	}
	
	@RequestMapping(value="/form-horarios", method=RequestMethod.POST)
	public String guardar(@Valid Horario horario, BindingResult result, Model model, RedirectAttributes flash,SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo","Formulario de Horario");
			model.addAttribute("titulo1","Formulario para los Horarios");
			return"form-horarios";
		}
		
		String mensajeFlash = (horario.getId() != null)? "Horario Editado con Éxito" : "Horario Creado con Éxito";
		
		horarioService.save(horario);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		return"redirect:horarios";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id, RedirectAttributes flash) {
		
		if(id>0) {
			horarioService.delete(id);
			flash.addFlashAttribute("success", "Horario Eliminado con Éxito");
		}
		
		return "redirect:/horarios";
	}

}
