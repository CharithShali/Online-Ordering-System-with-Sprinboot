package com.E052.db.Admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cart {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    int customer_id;
    int product_id;
    int quantity;
    double price;
    String image;

    public cart setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return image;
    }

    public cart(int id, int customer_id, int product_id, int quantity, double price, String image) {
        this.id = id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
    }

    public cart(int id, int customer_id, int product_id, int quantity, double price) {
        this.id = id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }
    public  cart(){

    }

    public cart(int id, int product_id, int quantity, double price) {
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public cart setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
        return this;
    }

    public cart setProduct_id(int product_id) {
        this.product_id = product_id;
        return this;
    }

    public cart setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public cart setPrice(double price) {
        this.price = price;
        return this;
    }

    public cart setId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
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
}
