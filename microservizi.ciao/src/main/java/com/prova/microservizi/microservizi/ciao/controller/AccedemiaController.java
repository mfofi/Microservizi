package com.prova.microservizi.microservizi.ciao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.microservizi.microservizi.ciao.entity.Accademia;
import com.prova.microservizi.microservizi.ciao.service.AccademiaService;

@RestController
@RequestMapping("/accademia")
public class AccedemiaController {

	@Autowired
	private AccademiaService accademiaService;
	
	@PostMapping("/save")
	public Accademia saveAccademia(Accademia accademia) {
		return accademiaService.save(accademia);
		
	}
}
