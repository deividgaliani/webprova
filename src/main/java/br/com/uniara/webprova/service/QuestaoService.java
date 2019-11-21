package br.com.uniara.webprova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniara.webprova.dao.QuestaoDAO;
import br.com.uniara.webprova.model.Questao;

@Service
public class QuestaoService implements IQuestaoService {
	
	@Autowired
	private QuestaoDAO questaoDAO;

	@Override
	public void salvar(Questao questao) {
		getQuestaoDAO().save(questao);
	}

	public QuestaoDAO getQuestaoDAO() {
		return questaoDAO;
	}

}
