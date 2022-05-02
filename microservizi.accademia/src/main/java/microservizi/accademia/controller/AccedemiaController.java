package microservizi.accademia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservizi.accademia.entity.Accademia;
import microservizi.accademia.service.AccademiaService;

@RestController
@RequestMapping("/accademia")
public class AccedemiaController {

	@Autowired
	private AccademiaService accademiaService;
	
	@PostMapping("/save")
	public Accademia saveAccademia(@RequestBody Accademia accademia) {
		return accademiaService.save(accademia);
	}
	
	@GetMapping("/getall")
	public List<Accademia> getAllAccademias() {
		return accademiaService.getAllAccademias();
	}
	
	@PutMapping("/edit")
	public Accademia editAccademia(@RequestBody Accademia accademia) {
		return accademiaService.editAccademia(accademia);
	}

}
