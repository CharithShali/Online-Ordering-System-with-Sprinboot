package com.E052.db.Admin.dto;

public class BrandDto {

    private String name;
    private String description;

    public BrandDto() {
    }

    public BrandDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BrandDto setName(String name) {
        this.name = name;
        return this;
    }

    public BrandDto setDescription(String description) {
        this.description = description;
        return this;
    }
}
