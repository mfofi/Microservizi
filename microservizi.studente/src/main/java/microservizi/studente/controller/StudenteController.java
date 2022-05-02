package microservizi.studente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservizi.studente.dto.StudenteDTO;
import microservizi.studente.entity.Studente;
import microservizi.studente.service.StudenteService;

@RestController
@RequestMapping("/studente")
public class StudenteController {
	
	@Autowired
	private StudenteService studenteService;

	@PostMapping("/save")
	public String save(@RequestBody StudenteDTO studentedto) {
		return studenteService.save(studentedto);
	}
	
	@DeleteMapping("/delete/{matricola}")
	public String delete(@PathVariable String matricola ) {
		return studenteService.delete(matricola);
	}
	
	@GetMapping("/getAll")
	public List<Studente> getAllStudenti(){
		return studenteService.getAllStudenti();
	}
	
	@GetMapping("/getStudente/{matricola}")
	public Studente getStudente(@PathVariable String matricola) {
		return studenteService.getStudente(matricola);
	}
	
	@PutMapping("/updateStudente")
	public String updateStudente(@RequestBody StudenteDTO studenteDTO) {
		return studenteService.update(studenteDTO);
	}
	
	
}
