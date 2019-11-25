package br.com.uniara.webprova.controller.vo;

public class ResultadoProvaVO {
	
	private Integer qtdAlternativas;
	
	private Integer qtdAcertos;
	
	private Integer qtdErros;
	
	private Double nota;

	public Integer getQtdAlternativas() {
		return qtdAlternativas;
	}

	public void setQtdAlternativas(Integer qtdAlternativas) {
		this.qtdAlternativas = qtdAlternativas;
	}

	public Integer getQtdAcertos() {
		return qtdAcertos;
	}

	public void setQtdAcertos(Integer qtdAcertos) {
		this.qtdAcertos = qtdAcertos;
	}

	public Integer getQtdErros() {
		return qtdErros;
	}

	public void setQtdErros(Integer qtdErros) {
		this.qtdErros = qtdErros;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
}
