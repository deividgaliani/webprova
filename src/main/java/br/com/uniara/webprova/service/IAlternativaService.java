package br.com.uniara.webprova.service;

import java.util.List;

import br.com.uniara.webprova.controller.vo.AlternativaVO;
import br.com.uniara.webprova.model.Alternativa;

public interface IAlternativaService {
	
	void salvar(Alternativa alternativa);
	
	List<AlternativaVO> recuperarAlternativasPorId(List<Integer> idsAlternativas);
}
