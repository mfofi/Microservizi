package microservizi.accademia.service;

import java.util.List;

import microservizi.accademia.entity.Accademia;

public interface AccademiaService {
	
	public Accademia save(Accademia accademia);

	public List<Accademia> getAllAccademias();

	public Accademia editAccademia(Accademia accademia);
}
