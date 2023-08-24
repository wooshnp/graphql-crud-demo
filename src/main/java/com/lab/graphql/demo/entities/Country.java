package com.lab.graphql.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Continent continent;

    private String currency;
    private String emoji;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
//    private List<Language> languages;

    private String name;
    private String phone;

}
