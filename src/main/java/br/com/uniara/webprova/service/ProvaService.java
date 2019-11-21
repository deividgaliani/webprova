package br.com.uniara.webprova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uniara.webprova.dao.ProvaDAO;
import br.com.uniara.webprova.model.Prova;

@Service
public class ProvaService implements IProvaService{
	
	@Autowired
	private ProvaDAO provaDAO;

	@Override
	public void salvar(Prova prova) {
		getProvaDAO().save(prova);
	}
	
	public ProvaDAO getProvaDAO() {
		return provaDAO;
	}

}
