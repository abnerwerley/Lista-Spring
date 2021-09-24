package br.com.generation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("MinhaSegundaAplicacao")
public class MinhaSegundaAplicacaoApplication {

	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(MinhaSegundaAplicacaoApplication.class, args);
		System.out.println("Objetivos de aprendizagem:"
				+ "\n Ter atenção aos detalhes, me familiarizar com o spring e com o banco de dados, e resolver os ecercícios");

	}

}
