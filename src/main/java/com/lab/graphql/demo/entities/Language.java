package com.lab.graphql.demo.entities;

import jakarta.persistence.*;

@Entity
public class Language {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "country_id")
//    private Country country;

}
