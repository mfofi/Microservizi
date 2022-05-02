package microservizi.studente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import microservizi.studente.entity.Studente;

@Repository
public interface StudenteRepository extends JpaRepository<Studente, Long> {

	@Query(value="select id_accademia from accademia where nome_accademia = :name", nativeQuery = true)
	public Long getIdByName(@Param("name") String name);

	@Query(value="select * from studente where matricola_studente = :matricola", nativeQuery = true)
	public Studente getByMatricola(@Param("matricola") String matricola);
}
