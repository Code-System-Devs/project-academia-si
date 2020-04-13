package com.academiasi.spring.app.models.services;

import java.util.List;

import com.academiasi.spring.app.models.entities.Horario;

public interface IHorarioService {
	
	public List<Horario> findAll();

}
