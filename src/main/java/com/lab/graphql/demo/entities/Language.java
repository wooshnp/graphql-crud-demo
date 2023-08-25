package com.lab.graphql.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Language {

    @Id
    @GeneratedValue
    private Long id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "country_id")
//    @JsonProperty("country")
//    private Country country;

}
