package com.prova.microservizi.microservizi.ciao.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accademia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAccademia;
	private String nomeAccademia;
	private String indirizzoAccademia;
	private String tipologiaAccademia;
	
}
