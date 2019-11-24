package br.com.uniara.webprova.controller;

import java.util.ArrayList;
import java.util.List;

public class ResultadoOperacao<T> {
	
	private Boolean sucesso;
	
	private List<T> lista;
	
	private String mensagem;
	
	private T dado;

	public Boolean getSucesso() {
		return sucesso;
	}

	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

	public List<T> getLista() {
		if (lista == null) {
			lista = new ArrayList<T>();
		}
		return lista;
	}

	public void setLista(List<T> lista) {
		this.lista = lista;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}
	
}
