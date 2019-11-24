package br.com.uniara.webprova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Alternativa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NRO_ALTERNATIVA")
	private Integer nroAlternativa;
	
	@Column(name = "TEXTO")
	private String texto;
	
	@ManyToOne()
	@JoinColumn(name = "ID_QUESTAO")
	private Questao questao;
	
	@Column(name = "ALTERNATIVA_CORRETA")
	private Boolean alternativaCorreta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNroAlternativa() {
		return nroAlternativa;
	}

	public void setNroAlternativa(Integer nroAlternativa) {
		this.nroAlternativa = nroAlternativa;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public Boolean getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(Boolean alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
	
}
