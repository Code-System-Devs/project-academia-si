package com.academiasi.spring.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.academiasi.spring.app.models.entities.Alumno;

public interface IAlumnoDao extends CrudRepository<Alumno, Long>{

}
