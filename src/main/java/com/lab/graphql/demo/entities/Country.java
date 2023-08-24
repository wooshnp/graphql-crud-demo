package com.lab.graphql.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Country {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @ToString.Exclude
    private List<Continent> continents;

    private String currency;
    private String emoji;

    @OneToMany
    @ToString.Exclude
    private List<Languages> languages;
    private String name;
    private String phone;

}
