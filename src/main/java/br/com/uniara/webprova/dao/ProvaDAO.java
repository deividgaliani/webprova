package br.com.uniara.webprova.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uniara.webprova.model.Prova;

@Repository
public interface ProvaDAO extends JpaRepository<Prova, Integer>{

}
