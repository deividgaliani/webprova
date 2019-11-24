package br.com.uniara.webprova.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.uniara.webprova.controller.vo.QuestaoVO;
import br.com.uniara.webprova.model.Questao;

@Repository
public interface QuestaoDAO extends JpaRepository<Questao, Integer>{
	
	@Query(" SELECT new br.com.uniara.webprova.controller.vo.QuestaoVO(q.id, q.pergunta) " + 
			" FROM Questao q " +
			" WHERE q.prova.id = :idProva ")
	List<QuestaoVO> recuperarPorIdProva(Integer idProva);
}
