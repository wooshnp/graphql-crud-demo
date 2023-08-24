package com.lab.graphql.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
}
