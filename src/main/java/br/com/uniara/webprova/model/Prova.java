package br.com.uniara.webprova.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prova {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@OneToMany(mappedBy = "prova", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Questao> questoes;

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

	public List<Questao> getQuestoes() {
		if (questoes == null) {
			questoes = new ArrayList<Questao>();
		}
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
	public Integer getQtdQuestoes() {
		return getQuestoes().size();
	}
	
}
