package com.generation.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class HelloWorldController {
	
	@GetMapping("/Ola")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/BSM")
	public String BSM() {
		return "return \"Responsabilidade Pessoal, \"\r\n"
				+ "                + \"\\n Mentalidade de Crescimento, \"\r\n"
				+ "                + \"\\n Orientação ao futuro, \"\r\n"
				+ "                + \"\\n Pró Atividade, \"\r\n"
				+ "                + \"\\n Comunicação, \"\r\n"
				+ "                + \"\\n Atenção aos detalhes, \"\r\n"
				+ "                + \"\\n Trabalho em equipe, \"\r\n"
				+ "                + \"\\n Persistência, \";";
	}
	
	
	
	
	@GetMapping("/Lista")
	public String Lista() {
		return "melhorar a coompreensão no conceito de API e springboot ";
	}

}
