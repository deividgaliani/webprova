package br.com.uniara.webprova.service;

import java.util.List;

import br.com.uniara.webprova.controller.vo.ProvaVO;
import br.com.uniara.webprova.model.Prova;

public interface IProvaService {
	
	void salvar(Prova prova);
	
	List<ProvaVO> recuperarProvasAluno();
	
	ProvaVO recuperarProva(Integer id);
	
}
