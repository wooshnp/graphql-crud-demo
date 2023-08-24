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
    private String id;
    private String name;
    private String code;

}
