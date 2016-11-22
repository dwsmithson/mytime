package com.grs.mt;

import com.grs.mt.model.Person;
import com.grs.mt.model.Task;
import com.grs.mt.repository.PersonRepository;
import com.grs.mt.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MytimeApplication {

	public static void main(String[] args) {

		SpringApplication.run(MytimeApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PersonRepository personRepository,
						   TaskRepository taskRepository) {

		return (evt) -> Arrays.asList("Kathy,Richard,Sam,Tony".split(","))
				.forEach(
						a -> {


							Person person = personRepository.save(new Person(a));

//							taskRepository.save(new Task(a + "Task1"));
//
//							taskRepository.save(new Task(a + "Task2"));

							System.out.println("Person: " + person);
						}

				);
	}
}
