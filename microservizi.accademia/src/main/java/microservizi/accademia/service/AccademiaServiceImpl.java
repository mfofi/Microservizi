package microservizi.accademia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import microservizi.accademia.entity.Accademia;
import microservizi.accademia.repository.AccademiaRepository;

@Service
@Transactional
public class AccademiaServiceImpl implements AccademiaService {
	
	@Autowired
	private AccademiaRepository accademiaRepository;
	
	@Override
	public Accademia save(Accademia accademia) {
		return accademiaRepository.save(accademia);
	}

	@Override
	public List<Accademia> getAllAccademias() {
		return accademiaRepository.findAll();
	}

	@Override
	public Accademia editAccademia(Accademia accademia) {
		Accademia old = accademiaRepository.getByName(accademia.getNomeAccademia());
		accademia.setIdAccademia(old.getIdAccademia());
		return accademiaRepository.save(accademia);
	}

}
