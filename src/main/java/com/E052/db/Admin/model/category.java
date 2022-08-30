package com.E052.db.Admin.model;


import javax.persistence.*;
import java.util.List;


@Entity
public class category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;


    private String description;

    @OneToMany
    private List<product> productList;

    public category() {
    }

    public category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}