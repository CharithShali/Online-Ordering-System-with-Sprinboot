package com.E052.db.Admin.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class brand {
    public brand(String name, String description) {
    }


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String description;

    @OneToMany
    private List<product> productList;

    public brand() {
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
