package com.academiasi.spring.app.models.services;

import java.util.List;

import com.academiasi.spring.app.models.entities.Alumno;

public interface IAlumnoService {

	public List<Alumno> findAll();

	public void save(Alumno alumno);

	public Alumno findOne(Long id);
	
	public void delete(Long id);

}
