package com.academiasi.spring.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.academiasi.spring.app.models.entities.Horario;

public interface IHorarioDao extends CrudRepository<Horario, Long>{

}
