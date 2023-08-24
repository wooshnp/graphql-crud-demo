package com.lab.graphql.demo.services;

import com.lab.graphql.demo.entities.Country;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CountryService {

    private final HttpGraphQlClient graphQlClient;

    public CountryService() {
        WebClient client = WebClient.builder()
                .baseUrl("https://countries.trevorblades.com/")
                .build();
        graphQlClient = HttpGraphQlClient.builder(client).build();
    }

    public Mono<List<Country>> getCountries() {
        String document = """
                query {
                   countries {
                     continent {
                       code
                       name
                     }
                     name
                     code
                     emoji
                     currency
                     phone
                   }
                 }
                """;

        return graphQlClient.document(document)
                .retrieve("countries")
                .toEntityList(Country.class);
    }
}
