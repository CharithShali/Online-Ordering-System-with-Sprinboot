package com.E052.db.Admin.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.*;

@Entity
public class product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String model;
    private double price;
    private String description;
    private int category_id;
    private int brand_id;

    @Lob
    @Column(columnDefinition = "MEDIUMLOB")
    private String image;



    public product( String name, String model, double price, String description, int category_id, int brand_id, String image) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
        this.description = description;
        this.category_id = category_id;
        this.brand_id = brand_id;
        this.image = image;
    }

    public product() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public String getImage() {
        return image;
    }

    public product setId(int id) {
        this.id = id;
        return this;
    }

    public product setName(String name) {
        this.name = name;
        return this;
    }

    public product setModel(String model) {
        this.model = model;
        return this;
    }

    public product setPrice(double price) {
        this.price = price;
        return this;
    }

    public product setDescription(String description) {
        this.description = description;
        return this;
    }

    public product setCategory_id(int category_id) {
        this.category_id = category_id;
        return this;
    }

    public product setBrand_id(int brand_id) {
        this.brand_id = brand_id;
        return this;
    }

    public product setImage(String image) {
        this.image = image;
        return this;
    }
}
