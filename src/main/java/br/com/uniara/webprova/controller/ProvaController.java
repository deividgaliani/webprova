package br.com.uniara.webprova.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.uniara.webprova.controller.vo.AlternativaVO;
import br.com.uniara.webprova.controller.vo.ProvaVO;
import br.com.uniara.webprova.controller.vo.ResultadoProvaVO;
import br.com.uniara.webprova.model.Alternativa;
import br.com.uniara.webprova.model.Prova;
import br.com.uniara.webprova.model.Questao;
import br.com.uniara.webprova.service.IAlternativaService;
import br.com.uniara.webprova.service.IProvaService;

@Controller
@RequestMapping(value = "prova")
public class ProvaController {
	
	@Autowired
	private IProvaService ProvaService;
	
	@Autowired
	private IAlternativaService alternativaService;
		
//	@RequestMapping(value={"", "/", "index"})
//	public String index() {
//		return "prova/index";
//	}
	
	@RequestMapping(value = "provas")
	public String provas() {
		return "prova/provas";
	}
	
	@RequestMapping(value = "cadastroProva")
	public String cadastroProva() {
		return "prova/cadastroProva";
	}
	
	@RequestMapping(value = "inciarProva")
	public String inciarProva(Model model, @RequestParam Integer id) {
		model.addAttribute("idProva", id);
		return "prova/inicioProva";
	}
	
	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public @ResponseBody ResultadoOperacao<ProvaVO> salvar(@RequestBody Prova prova) {
		ResultadoOperacao<ProvaVO> resultadoOperacao = new ResultadoOperacao<ProvaVO>();
		try {
			for (Questao q : prova.getQuestoes()) {
				q.setProva(prova);
				for (Alternativa a : q.getAlternativas()) {
					a.setQuestao(q);
				}
			}
			getProvaService().salvar(prova);
			resultadoOperacao.setSucesso(Boolean.TRUE);
		}catch (Exception e) {
			resultadoOperacao.setSucesso(Boolean.FALSE);
			resultadoOperacao.setMensagem("Falha ao tentar salvar a prova");
		}
		return resultadoOperacao;
	}
	
	@RequestMapping(value = "recuperarProvasAluno")
	public @ResponseBody List<ProvaVO> recuperarProvasAluno(){		
		try {
			return getProvaService().recuperarProvasAluno();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "recuperarProva", method = RequestMethod.GET)
	public @ResponseBody ResultadoOperacao<ProvaVO> recuperarProva(@RequestParam Integer idProva) {
		ResultadoOperacao<ProvaVO> resultadoOperacao = new ResultadoOperacao<ProvaVO>();
		try {
 			ProvaVO retorno = getProvaService().recuperarProva(idProva);
 			resultadoOperacao.setDado(retorno);
			resultadoOperacao.setSucesso(Boolean.TRUE);
		}catch (Exception e) {
			resultadoOperacao.setSucesso(Boolean.FALSE);
			resultadoOperacao.setMensagem("Falha ao buscar a prova");
		}
		return resultadoOperacao;
	}
	
	@RequestMapping(value = "entregarProva", method = RequestMethod.POST)
	public @ResponseBody ResultadoOperacao<ResultadoProvaVO> entregarProva(@RequestBody ProvaVO prova) {
		ResultadoOperacao<ResultadoProvaVO> resultadoOperacao = new ResultadoOperacao<ResultadoProvaVO>();
		
		try {
			ProvaVO provaVo = getProvaService().recuperarProva(prova.getIdProva());
			List<AlternativaVO> respostas = getAlternativaService().recuperarAlternativasPorId(prova.getRespostas());
			ResultadoProvaVO resultado = calculaResultadoProva(provaVo.getQtdQuestoes(), respostas);
			resultadoOperacao.setDado(resultado);
			resultadoOperacao.setSucesso(Boolean.TRUE);
		}catch (Exception e) {
			resultadoOperacao.setSucesso(Boolean.FALSE);
		}
		
		return resultadoOperacao;
	}
	
	private ResultadoProvaVO calculaResultadoProva(Long qtdQuestoes, List<AlternativaVO> alternativas) {
		ResultadoProvaVO resultado = new ResultadoProvaVO();
		Integer qtdAcerto = 0;
		for (AlternativaVO a : alternativas) {
			if(a.getAlternativaCorreta()) {
				qtdAcerto++;
			}
		}
		
		Integer quantidadeQuestoes = Math.toIntExact(qtdQuestoes);
		Double nota = 10.0 / quantidadeQuestoes * qtdAcerto;
		
		resultado.setQtdAcertos(qtdAcerto);
		resultado.setQtdAlternativas(quantidadeQuestoes);
		resultado.setQtdErros(quantidadeQuestoes - qtdAcerto);
		resultado.setNota(nota);
		
		return resultado;
	}
	
	public IProvaService getProvaService() {
		return ProvaService;
	}

	public IAlternativaService getAlternativaService() {
		return alternativaService;
	}
	
}
