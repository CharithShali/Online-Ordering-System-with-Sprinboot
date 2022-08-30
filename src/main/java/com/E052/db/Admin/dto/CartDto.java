package com.E052.db.Admin.dto;

public class CartDto {
    int customer_id;
    int product_id;
    int quantity;
    double price;
    String image;

    public CartDto setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CartDto(int customer_id, int product_id, int quantity, double price, String image) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
    }

    public CartDto() {
    }

    public CartDto setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
        return this;
    }

    public CartDto setProduct_id(int product_id) {
        this.product_id = product_id;
        return this;
    }

    public CartDto setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public CartDto setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public CartDto(int customer_id, int product_id, int quantity, double price) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }
}
