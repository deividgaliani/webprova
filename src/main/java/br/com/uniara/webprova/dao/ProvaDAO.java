package br.com.uniara.webprova.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.uniara.webprova.controller.vo.ProvaVO;
import br.com.uniara.webprova.model.Prova;

@Repository
public interface ProvaDAO extends JpaRepository<Prova, Integer>{
	
	@Query(" SELECT new br.com.uniara.webprova.controller.vo.ProvaVO(p.id, p.titulo, COUNT(q.id)) " + 
			" FROM Prova p " +
			" JOIN p.questoes q " +
			" GROUP BY p.id " )	
	public List<ProvaVO> recuperarProvasAluno();
	
	@Query(" SELECT new br.com.uniara.webprova.controller.vo.ProvaVO(p.id, p.titulo, COUNT(q.id)) " + 
			" FROM Prova p " +
			" JOIN p.questoes q " +
			" WHERE p.id = :id " + 
			" GROUP BY p.id ")
	public ProvaVO recuperarProvaPorId(Integer id);
}
