package microservizi.accademia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import microservizi.accademia.entity.Accademia;

@Repository
public interface AccademiaRepository extends JpaRepository<Accademia, Long> {

	@Query(value="Select * from accademia where nome_accademia = :nome", nativeQuery = true)
	public Accademia getByName(@Param("nome") String nomeAccademia);

}
