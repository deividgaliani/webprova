package br.com.uniara.webprova;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import br.com.uniara.webprova.model.Alternativa;
import br.com.uniara.webprova.model.Prova;
import br.com.uniara.webprova.model.Questao;
import br.com.uniara.webprova.service.IAlternativaService;
import br.com.uniara.webprova.service.IProvaService;
import br.com.uniara.webprova.service.IQuestaoService;

@SpringBootApplication
public class WebprovaApplication {
	
	@Autowired
	private IProvaService provaService;
	
	@Autowired
	private IQuestaoService questaoService;
	
	@Autowired
	private IAlternativaService alternativaService;

	public static void main(String[] args) {
		SpringApplication.run(WebprovaApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
//        	salvarProvaTeste();
        	System.out.println("Servidor rodando");
        };
    }

	private void salvarProvaTeste() {
		Prova prova = new Prova();
		Questao q1 = new Questao();
		Alternativa a1 = new Alternativa();
		Alternativa a2 = new Alternativa();
		Alternativa a3 = new Alternativa();
		
		prova.setTitulo("Prova Teste");
		
		q1.setProva(prova);
		q1.setPergunta("Quanto é 1 + 1?");
		
		a1.setNroAlternativa(1);
		a1.setTexto("2");
		a1.setAlternativaCorreta(Boolean.TRUE);
		a1.setQuestao(q1);
		
		a2.setNroAlternativa(2);
		a2.setTexto("1");
		a2.setAlternativaCorreta(Boolean.FALSE);
		a2.setQuestao(q1);
		
		a3.setNroAlternativa(3);
		a3.setTexto("3");
		a3.setAlternativaCorreta(Boolean.FALSE);
		a3.setQuestao(q1);
		
		q1.setAlternativas(Arrays.asList(a1, a2, a3));
		q1.setProva(prova);
		
		prova.setQuestoes(Arrays.asList(q1));
		
		
		provaService.salvar(prova);
		questaoService.salvar(q1);
		alternativaService.salvar(a1);
		alternativaService.salvar(a2);
		alternativaService.salvar(a3);
	}

}
