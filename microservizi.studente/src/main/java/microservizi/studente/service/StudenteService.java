package microservizi.studente.service;

import java.util.List;

import microservizi.studente.dto.StudenteDTO;
import microservizi.studente.entity.Studente;

public interface StudenteService {

	public String save(StudenteDTO studenteDTO);

	public String delete(String matricola);

	public List<Studente> getAllStudenti();

	public Studente getStudente(String matricola);

	public String update(StudenteDTO studenteDTO);

}
