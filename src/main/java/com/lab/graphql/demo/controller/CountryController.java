package com.lab.graphql.demo.controller;

import com.lab.graphql.demo.entities.Country;
import com.lab.graphql.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    private final CountryRepository repository;

    @Autowired
    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @QueryMapping
    List<Country> countries() {
        return repository.findAll();
    }

    /*
     * FYI: method name has to match with query created in schema.graphqls
     * */
    @QueryMapping
    Optional<Country> countryById(@Argument Long id) {
        return repository.findById(id);
    }

    /*
    *
    * mutation {
  addCountry(
    country: {name: "Nunos Kingdom", currency: "EURO, DOLLAR", emoji: "👑"}
  ) {
    id
    name
  }w
}
    * */
    @MutationMapping
    Country addCountry(@Argument CountryInput country) {
        Country c = new Country(country.name, country.currency, country.emoji);
        return repository.save(c);
    }

    record CountryInput(String name, String currency, String emoji) {
    }
}
