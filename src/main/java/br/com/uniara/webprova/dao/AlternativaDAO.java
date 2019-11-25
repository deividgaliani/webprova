package br.com.uniara.webprova.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.uniara.webprova.controller.vo.AlternativaVO;
import br.com.uniara.webprova.model.Alternativa;

@Repository
public interface AlternativaDAO extends JpaRepository<Alternativa, Integer>{
	
	@Query(" SELECT new br.com.uniara.webprova.controller.vo.AlternativaVO(a.nroAlternativa, a.texto, a.id) " + 
			" FROM Alternativa a " +
			" WHERE a.questao.id = :idQuestao ")
	List<AlternativaVO> recuperarPorIdQuestao(Integer idQuestao);
	
	@Query(" SELECT new br.com.uniara.webprova.controller.vo.AlternativaVO(a.nroAlternativa, a.texto, a.id, a.alternativaCorreta) " + 
			" FROM Alternativa a " +
			" WHERE a.id IN (:idsAlternativas) ")
	List<AlternativaVO> recuperarAlternativasPorId(List<Integer> idsAlternativas);
}
