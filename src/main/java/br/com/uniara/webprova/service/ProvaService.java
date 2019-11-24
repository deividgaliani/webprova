package br.com.uniara.webprova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniara.webprova.controller.vo.AlternativaVO;
import br.com.uniara.webprova.controller.vo.ProvaVO;
import br.com.uniara.webprova.controller.vo.QuestaoVO;
import br.com.uniara.webprova.dao.AlternativaDAO;
import br.com.uniara.webprova.dao.ProvaDAO;
import br.com.uniara.webprova.dao.QuestaoDAO;
import br.com.uniara.webprova.model.Prova;

@Service
public class ProvaService implements IProvaService{
	
	@Autowired
	private ProvaDAO provaDAO;
	
	@Autowired
	private QuestaoDAO questaoDAO;
	
	@Autowired
	private AlternativaDAO alternativaDAO;

	@Override
	public void salvar(Prova prova) {
		getProvaDAO().save(prova);
	}

	@Override
	public List<ProvaVO> recuperarProvasAluno() {
		return getProvaDAO().recuperarProvasAluno();
	}

	@Override
	public ProvaVO recuperarProva(Integer id) {
		ProvaVO prova = getProvaDAO().recuperarProvaPorId(id); 
		List<QuestaoVO> questoes = getQuestaoDAO().recuperarPorIdProva(id);
		
		for (QuestaoVO questao : questoes) {
			List<AlternativaVO> alternativas = getAlternativaDAO().recuperarPorIdQuestao(questao.getId());
			questao.setAlternativas(alternativas);
		}
		
		prova.setQuestoes(questoes);
		return prova;
	}

	public ProvaDAO getProvaDAO() {
		return provaDAO;
	}
	
	public QuestaoDAO getQuestaoDAO() {
		return questaoDAO;
	}

	public AlternativaDAO getAlternativaDAO() {
		return alternativaDAO;
	}
	
}
