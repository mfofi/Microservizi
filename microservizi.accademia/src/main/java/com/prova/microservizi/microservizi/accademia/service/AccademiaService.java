package com.prova.microservizi.microservizi.accademia.service;

import java.util.List;

import com.prova.microservizi.microservizi.accademia.entity.Accademia;

public interface AccademiaService {
	
	public Accademia save(Accademia accademia);

	public List<Accademia> getAllAccademias();

	public Accademia editAccademia(Accademia accademia);
}
