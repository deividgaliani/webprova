package br.com.uniara.webprova.controller.vo;

public class AlternativaVO {
	
	private Integer nroAlternativa;
	
	private String texto;
	
	private Boolean alternativaCorreta;

	public AlternativaVO() {}

	public AlternativaVO(Integer nroAlternativa, String texto, Boolean alternativaCorreta) {
		this.nroAlternativa = nroAlternativa;
		this.texto = texto;
		this.alternativaCorreta = alternativaCorreta;
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

	public Boolean getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(Boolean alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
	
}
