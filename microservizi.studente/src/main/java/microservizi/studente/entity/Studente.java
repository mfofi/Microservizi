package microservizi.studente.entity;

import java.util.Date;

import javax.persistence.*;


@Entity(name = "STUDENTE")
@Table(name = "studente")
public class Studente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_studente")
	private Long idStudente;
	
	@Column(name="matricola_studente", nullable=false, length=18)
	private String matricolaStudente;
	
	@Column(name="nome_studente", nullable=false, length=45)
	private String nomeStudente;
	
	@Column(name="cognome_studente", nullable=false, length=45)
	private String cognomeStudente;

	@Column(name="data_nascita", nullable=true)
	private Date dataNascita;
	
	@Column(name="luogo_nascita", nullable=false, length=45)
	private String luogoNascita;
	
	@Column(name="fk_accademia", nullable=false)
	private Long fkAccademia;
	
	@Column(name="data_iscrizione", nullable=false)
	private Date dataIscrizione;

	public Long getIdStudente() {
		return idStudente;
	}

	public void setIdStudente(Long idStudente) {
		this.idStudente = idStudente;
	}

	public String getNomeStudente() {
		return nomeStudente;
	}

	public String getMatricolaStudente() {
		return matricolaStudente;
	}

	public void setMatricolaStudente(String matricolaStudente) {
		this.matricolaStudente = matricolaStudente;
	}

	public void setNomeStudente(String nomeStudente) {
		this.nomeStudente = nomeStudente;
	}

	public String getCognomeStudente() {
		return cognomeStudente;
	}

	public void setCognomeStudente(String cognomeStudente) {
		this.cognomeStudente = cognomeStudente;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public Long getFkAccademia() {
		return fkAccademia;
	}

	public void setFkAccademia(Long fkAccademia) {
		this.fkAccademia = fkAccademia;
	}

	public Date getDataIscrizione() {
		return dataIscrizione;
	}

	public void setDataIscrizione(Date dataIscrizione) {
		this.dataIscrizione = dataIscrizione;
	}

	public Studente() {
		super();
	}

	public Studente(Long idStudente, String matricolaStudente, String nomeStudente, String cognomeStudente,
			Date dataNascita, String luogoNascita, Long fkAccademia, Date dataIscrizione) {
		super();
		this.idStudente = idStudente;
		this.matricolaStudente = matricolaStudente;
		this.nomeStudente = nomeStudente;
		this.cognomeStudente = cognomeStudente;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.fkAccademia = fkAccademia;
		this.dataIscrizione = dataIscrizione;
	}

	@Override
	public String toString() {
		return "Studente [idStudente=" + idStudente + ", matricolaStudente=" + matricolaStudente + ", nomeStudente="
				+ nomeStudente + ", cognomeStudente=" + cognomeStudente + ", dataNascita=" + dataNascita
				+ ", luogoNascita=" + luogoNascita + ", fkAccademia=" + fkAccademia + ", dataIscrizione="
				+ dataIscrizione + "]";
	}	
	
}
