package com.lab.graphql.demo;

import com.lab.graphql.demo.entities.Country;
import com.lab.graphql.demo.repository.CountryRepository;
import com.lab.graphql.demo.services.CountryService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import java.util.List;

@SpringBootApplication
public class LabGraphqlCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabGraphqlCrudDemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(CountryService service, CountryRepository repository) {
		return args -> {
			Mono<List<Country>> countries = service.getCountries();
			countries.subscribe(repository::saveAll);
		};
	}

}
