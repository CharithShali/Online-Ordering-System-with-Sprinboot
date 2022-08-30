package com.E052.db.Admin.dto;


import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    private String name;
    private String model;
    private double price;
    private String description;
    private int category_id;
    private int brand_id;
    private MultipartFile image;


    public ProductDto() {

    }

    public ProductDto setImage(MultipartFile image) {
        this.image = image;
        return this;
    }

    public MultipartFile getImage() {
        return image;
    }

    public ProductDto(String name, String model, double price, String description, int category_id, int brand_id, MultipartFile image) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.description = description;
        this.category_id = category_id;
        this.brand_id = brand_id;
        this.image = image;
    }

    public ProductDto setBrandId(int brandId) {
        this.brand_id = brandId;
        return this;
    }

    public ProductDto setCategory_id(int category_id) {
        this.category_id = category_id;
        return this;
    }

    public ProductDto setBrand_id(int brand_id) {
        this.brand_id = brand_id;
        return this;
    }

    public int getCategory_id() {
        return category_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public int getCategoryId() {
        return category_id;
    }

    public int getBrandId() {
        return brand_id;
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

    public ProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public ProductDto setModel(String model) {
        this.model = model;
        return this;
    }

    public ProductDto setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
