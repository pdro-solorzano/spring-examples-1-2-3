package com.example.springEx3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEx3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringEx3Application.class, args);
		PersonaRepository repository = context.getBean(PersonaRepository.class);

		Persona persona = new Persona(null, "Pedro", "Solorzano Gomez", 1995);
		repository.save(persona);
	}

}
