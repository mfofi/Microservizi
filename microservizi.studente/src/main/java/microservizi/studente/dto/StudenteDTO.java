package microservizi.studente.dto;

public class StudenteDTO {

	private String matricolaStudente;
	private String nomeStudente;
	private String cognomeStudente;
	private String dataNascita;
	private String luogoNascita; 
	private String fkAccademia;
	
	
	
	public String getMatricolaStudente() {
		return matricolaStudente;
	}
	public void setMatricolaStudente(String matricolaStudente) {
		this.matricolaStudente = matricolaStudente;
	}
	public String getNomeStudente() {
		return nomeStudente;
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
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getFkAccademia() {
		return fkAccademia;
	}
	public void setFkAccademia(String fkAccademia) {
		this.fkAccademia = fkAccademia;
	}
	
	public StudenteDTO(String matricolaStudente, String nomeStudente, String cognomeStudente, String dataNascita,
			String luogoNascita, String fkAccademia) {
		super();
		this.matricolaStudente = matricolaStudente;
		this.nomeStudente = nomeStudente;
		this.cognomeStudente = cognomeStudente;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.fkAccademia = fkAccademia;
	}
	public StudenteDTO() {
		super();
	}
	@Override
	public String toString() {
		return "StudenteDTO [matricolaStudente=" + matricolaStudente + ", nomeStudente=" + nomeStudente
				+ ", cognomeStudente=" + cognomeStudente + ", dataNascita=" + dataNascita + ", luogoNascita="
				+ luogoNascita + ", fkAccademia=" + fkAccademia + "]";
	}
	
}
