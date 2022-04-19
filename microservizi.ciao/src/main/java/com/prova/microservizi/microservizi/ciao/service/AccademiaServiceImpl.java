package com.prova.microservizi.microservizi.ciao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prova.microservizi.microservizi.ciao.entity.Accademia;
import com.prova.microservizi.microservizi.ciao.repository.AccademiaRepository;

@Service
@Transactional
public class AccademiaServiceImpl implements AccademiaService {
	
	@Autowired
	private AccademiaRepository accademiaRepository;
	
	@Override
	public Accademia save(Accademia accademia) {
		return accademiaRepository.save(accademia);
	}

}
