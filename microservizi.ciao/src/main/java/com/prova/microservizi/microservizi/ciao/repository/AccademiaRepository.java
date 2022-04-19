package com.prova.microservizi.microservizi.ciao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prova.microservizi.microservizi.ciao.entity.Accademia;

@Repository
public interface AccademiaRepository extends JpaRepository<Accademia, Long> {

}
