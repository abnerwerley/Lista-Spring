package br.com.generation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("MinhaPrimeiraAplicacao")
public class MinhaPrimeiraAplicacaoApplication {

	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(MinhaPrimeiraAplicacaoApplication.class, args);
		System.out.println("Atenção aos Detalhes!");
		System.out.println("Responsabilidade Pessoal");
		System.out.println("Persistência!");
		System.out.println("Muita Persistência!!!");

	}

}
