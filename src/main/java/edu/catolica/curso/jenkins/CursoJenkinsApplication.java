package edu.catolica.curso.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CursoJenkinsApplication extends SpringBootServletInitializer {

	@GetMapping("/")
	public String init(){
		return "Bem vindo ao Mini Curso de Jenkins!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CursoJenkinsApplication.class, args);
	}

}
