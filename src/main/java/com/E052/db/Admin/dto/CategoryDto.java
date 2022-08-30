package com.E052.db.Admin.dto;

public class CategoryDto {
    private String name;


    private String description;

    public CategoryDto() {
    }

    public CategoryDto(String name, String description) {

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public CategoryDto setName(String name) {
        this.name = name;
        return this;
    }

    public CategoryDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }
}
