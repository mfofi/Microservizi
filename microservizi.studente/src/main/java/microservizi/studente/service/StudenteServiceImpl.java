package microservizi.studente.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import microservizi.studente.dto.StudenteDTO;
import microservizi.studente.entity.Studente;
import microservizi.studente.repository.StudenteRepository;

@Service
@Transactional
public class StudenteServiceImpl implements StudenteService {

	@Autowired
	private StudenteRepository studenteRepository;
	
	@Override
	public String save(StudenteDTO studenteDTO) {
		Studente studente = new Studente();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
		Date dataNascita = new Date();
		Date dataIscrizione = new Date();
		Long idAcc = studenteRepository.getIdByName(studenteDTO.getFkAccademia());
		
		if( idAcc != null) {
			try {
				dataNascita = formatDate.parse(studenteDTO.getDataNascita());
				studente.setMatricolaStudente(studenteDTO.getMatricolaStudente());
				studente.setNomeStudente(studenteDTO.getNomeStudente());		
				studente.setCognomeStudente(studenteDTO.getCognomeStudente());	
				studente.setLuogoNascita(studenteDTO.getLuogoNascita());
				studente.setDataNascita(dataNascita);	
				studente.setFkAccademia(idAcc);
				studente.setDataIscrizione(dataIscrizione);
				studenteRepository.save(studente);
			
				return "Lo studente " +studente.getCognomeStudente() +" "+ studente.getNomeStudente()+ " è stato aggiunto nel DB";
			
			} catch (ParseException e) {
				dataNascita = null;
			} catch (Exception e1) {
				return "Non è stato possibile inserire lo studente nel DB";
			}
			return "Non è stato possibile inserire lo studente nel DB";
		}else {
			return "Non è stato possibile inserire lo studente nel DB";
		}
	}

	
	@Override
	public String delete(String matricola) {
		studenteRepository.delete(studenteRepository.getByMatricola(matricola));
		return "Utente cancellato con successo;";
	}


	@Override
	public List<Studente> getAllStudenti() {
		return studenteRepository.findAll();
	}


	@Override
	public Studente getStudente(String matricola) {
		return studenteRepository.getByMatricola(matricola);
	}


	@Override
	public String update(StudenteDTO studenteDTO) {
		Studente studente = studenteRepository.getByMatricola(studenteDTO.getMatricolaStudente());
		Date dataNascita = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
		try {
		dataNascita = formatDate.parse(studenteDTO.getDataNascita());
		
		studente.setNomeStudente(studenteDTO.getNomeStudente());
		studente.setCognomeStudente(studenteDTO.getCognomeStudente());
		studente.setLuogoNascita(studenteDTO.getLuogoNascita());
		studente.setDataNascita(dataNascita);
		}catch(ParseException p) {
			return "Non è stato possibile aggiornare l'utente";
		}
		studenteRepository.save(studente);		
		return "Lo studente è stato modificato con successo";
	}
}
