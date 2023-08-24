package com.lab.graphql.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Languages {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String code;

}
