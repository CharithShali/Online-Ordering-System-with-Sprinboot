package com.E052.db.Admin.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customerorder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    int customer_id;
    String method;
    int card;
    String address;
    double price;
    String status;

    public customerorder setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public customerorder(int id, int customer_id, String method, int card, String address, double price, String status) {
        this.id = id;
        this.customer_id = customer_id;
        this.method = method;
        this.card = card;
        this.address = address;
        this.price = price;
        this.status = status;
    }

    public customerorder() {
    }

    public customerorder setId(int id) {
        this.id = id;
        return this;
    }

    public customerorder setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
        return this;
    }

    public customerorder setMethod(String method) {
        this.method = method;
        return this;
    }

    public customerorder setCard(int card) {
        this.card = card;
        return this;
    }

    public customerorder setAddress(String address) {
        this.address = address;
        return this;
    }

    public customerorder setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getId() {
        return id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getMethod() {
        return method;
    }

    public int getCard() {
        return card;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }
}
