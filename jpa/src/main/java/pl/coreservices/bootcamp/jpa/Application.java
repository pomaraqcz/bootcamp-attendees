package pl.coreservices.bootcamp.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.coreservices.bootcamp.jpa.model.Content;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

@SpringBootApplication
public class Application {

	@PersistenceContext
	EntityManager entityManager;
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo() {
		return (args)->{

//			entityManager.getTransaction().begin();
			// tu załaduj dane do bazy
		};
	}
}
