package com.academiasi.spring.app.models.services;

import java.util.List;

import com.academiasi.spring.app.models.entities.Horario;

public interface IHorarioService {
	
	public List<Horario> findAll();
	
	public void save(Horario horario);
	
	public Horario findOne(Long id);
	
	public void delete(Long id);

}
