package com.academiasi.spring.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.academiasi.spring.app.models.entities.Alumno;
import com.academiasi.spring.app.models.services.IAlumnoService;

@Controller
@SessionAttributes("alumno")
public class AlumnoController {

	@Autowired
	private IAlumnoService alumnoService;

	@RequestMapping(value = "/alumnos", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Alumnos");
		model.addAttribute("titulo1", "Listado de Alumnos");
		model.addAttribute("alumnos", alumnoService.findAll());
		return "listaralumnos";
	}

	@RequestMapping(value = "/form-alumnos")
	public String crear(Map<String, Object> model) {

		Alumno alumno = new Alumno();
		model.put("alumno", alumno);
		model.put("titulo", "Formulario de Alumno");
		return "form-alumnos";
	}

	@RequestMapping(value = "/form-alumnos/{id}")
	public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model) {

		Alumno alumno = null;

		if (id > 0) {
			alumno = alumnoService.findOne(id);

		} else {

			return "redirect:/alumnos";
		}
		model.put("alumno", alumno);
		model.put("titulo", "Editar Alumno");

		return "form-alumnos";
	}

	@RequestMapping(value = "/form-alumnos", method = RequestMethod.POST)
	public String guardar(@Valid Alumno alumno, BindingResult result, Model model, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de alumnos");
			return "form-alumnos";
		}

		alumnoService.save(alumno);
		status.setComplete();
		return "redirect:alumnos";
	}

	@GetMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {

		if (id > 0) {

			alumnoService.delete(id);

		}

		return "redirect:/alumnos";

	}

}