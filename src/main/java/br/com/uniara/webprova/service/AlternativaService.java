package br.com.uniara.webprova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniara.webprova.controller.vo.AlternativaVO;
import br.com.uniara.webprova.dao.AlternativaDAO;
import br.com.uniara.webprova.model.Alternativa;

@Service
public class AlternativaService implements IAlternativaService {

	@Autowired
	private AlternativaDAO alternativaDAO;
	
	@Override
	public void salvar(Alternativa alternativa) {
		getAlternativaDAO().save(alternativa);
	}

	@Override
	public List<AlternativaVO> recuperarAlternativasPorId(List<Integer> idsAlternativas) {
		return getAlternativaDAO().recuperarAlternativasPorId(idsAlternativas);
	}
	
	public AlternativaDAO getAlternativaDAO() {
		return alternativaDAO;
	}
	
}
