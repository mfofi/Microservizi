package com.prova.microservizi.microservizi.accademia.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name="Accademia")
@Table(name="ACCADEMIA")
@AllArgsConstructor
@NoArgsConstructor
public class Accademia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_accademia")
	private Long idAccademia;
	
	@Column(name="nome_accademia")
	private String nomeAccademia;
	
	@Column(name="indirizzo_accademia")
	private String indirizzoAccademia;
	
	@Column(name="tipologia_accademia")
	private String tipologiaAccademia;

	public Long getIdAccademia() {
		return idAccademia;
	}

	public void setIdAccademia(Long idAccademia) {
		this.idAccademia = idAccademia;
	}

	public String getNomeAccademia() {
		return nomeAccademia;
	}

	public void setNomeAccademia(String nomeAccademia) {
		this.nomeAccademia = nomeAccademia;
	}

	public String getIndirizzoAccademia() {
		return indirizzoAccademia;
	}

	public void setIndirizzoAccademia(String indirizzoAccademia) {
		this.indirizzoAccademia = indirizzoAccademia;
	}

	public String getTipologiaAccademia() {
		return tipologiaAccademia;
	}

	public void setTipologiaAccademia(String tipologiaAccademia) {
		this.tipologiaAccademia = tipologiaAccademia;
	}

	@Override
	public String toString() {
		return "Accademia [idAccademia=" + idAccademia + ", nomeAccademia=" + nomeAccademia + ", indirizzoAccademia="
				+ indirizzoAccademia + ", tipologiaAccademia=" + tipologiaAccademia + "]";
	}

	public Accademia(Long idAccademia, String nomeAccademia, String indirizzoAccademia, String tipologiaAccademia) {
		super();
		this.idAccademia = idAccademia;
		this.nomeAccademia = nomeAccademia;
		this.indirizzoAccademia = indirizzoAccademia;
		this.tipologiaAccademia = tipologiaAccademia;
	}

	public Accademia() {
		super();
	}
	
	
}
