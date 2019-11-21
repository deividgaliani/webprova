package br.com.uniara.webprova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "prova")
public class ProvaController {
	
	@RequestMapping(value = "index")
	public String index() {
		return "prova/index";
	}
	
	@RequestMapping(value = "cadastroProva")
	public String cadastroProva() {
		return "prova/cadastroProva";
	}
}
