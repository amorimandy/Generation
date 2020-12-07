package com.genbr.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generation")

public class GenController {
	
	@GetMapping
	public String GenBr() {
	
	String text = "A primeira habilidade que precisei desenvolver foi a de "
			+ "Orientação aos detalhes, pois é preciso muita atenção ao desenvolver"
			+ " um programa com esse.";
	return text;
	}
	
	@GetMapping("/habilidade2")
	public String GenBr1() {
	
	String text = "A segunda habilidade foi a de proatividade "
			+ "para ter o ímpeto de buscar documentos e livros por fora do conteúdo"
			+ " para agragar um pouco mais de conhecimento e construir um conhecimento"
			+ " mais sólido além do mostrado em aula.";
	return text;
	}
	
	@GetMapping("/mentalidade1")
	public String GenBr2() {
	
	String text = "A primeira mentalidade que precisa desenvolver para aprender esse"
			+ " conteúdo foi a de persistência, afinal é muito difícil aprender "
			+ "conteúdos novos e desafiantes como este.";
	return text;
	}
	
	@GetMapping("/mentalidade2")
	public String GenBr3() {
	
	String text = "E a segunda foi a mentalidade referente a orientação ao futuro, "
			+ "pois meu futuro depende de minhas atitudes no hoje.";
	return text;
	}
}





