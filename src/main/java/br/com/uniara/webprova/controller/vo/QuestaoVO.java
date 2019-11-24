package br.com.uniara.webprova.controller.vo;

import java.util.ArrayList;
import java.util.List;

public class QuestaoVO {
	
	private Integer id;
	
	private String pergunta;
	
	private List<AlternativaVO> alternativas;

	public QuestaoVO() {}

	public QuestaoVO(Integer id, String pergunta) {
		this.id = id;
		this.pergunta = pergunta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public List<AlternativaVO> getAlternativas() {
		if (alternativas == null) {
			alternativas = new ArrayList<AlternativaVO>();
		}
		return alternativas;
	}

	public void setAlternativas(List<AlternativaVO> alternativas) {
		this.alternativas = alternativas;
	}
	
	
}
