package br.com.uniara.webprova.controller.vo;

import java.util.ArrayList;
import java.util.List;

public class ProvaVO {
	
	private Integer id;
	
	private String titulo;
	
	private Long qtdQuestoes;
	
	List<QuestaoVO> questoes;
	
	public ProvaVO() {}
	
	public ProvaVO(Integer id, String titulo, Long qtdQuestoes) {
		this.id = id;
		this.titulo = titulo;
		this.qtdQuestoes = qtdQuestoes;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getQtdQuestoes() {
		return qtdQuestoes;
	}

	public void setQtdQuestoes(Long qtdQuestoes) {
		this.qtdQuestoes = qtdQuestoes;
	}

	public List<QuestaoVO> getQuestoes() {
		if (questoes == null) {
			questoes = new ArrayList<QuestaoVO>();
		}
		return questoes;
	}

	public void setQuestoes(List<QuestaoVO> questoes) {
		this.questoes = questoes;
	}
	
}
