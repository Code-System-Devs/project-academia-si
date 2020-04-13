package com.academiasi.spring.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academiasi.spring.app.models.dao.IHorarioDao;
import com.academiasi.spring.app.models.entities.Horario;

@Service
public class HorarioServiceImpl implements IHorarioService{

	@Autowired
	private IHorarioDao horarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Horario> findAll() {
		return (List<Horario>) horarioDao.findAll();
	}

	@Override
	@Transactional
	public void save(Horario horario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly = true)
	public Horario findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
