package com.E052.db.Admin.dto;

public class OrderDto {

    int customer_id;
    String method;
    int card;
    String address;
    double price;
    String status;

    public OrderDto setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public OrderDto(int customer_id, String method, int card, String address, double price, String status) {
        this.customer_id = customer_id;
        this.method = method;
        this.card = card;
        this.address = address;
        this.price = price;
        this.status = status;
    }

    public OrderDto(int customer_id, int cart_id, String method, int card, String address, double price) {
        this.customer_id = customer_id;
        this.method = method;
        this.card = card;
        this.address = address;
        this.price = price;
    }

    public OrderDto() {
    }

    public OrderDto setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
        return this;
    }


    public OrderDto setMethod(String method) {
        this.method = method;
        return this;
    }

    public OrderDto setCard(int card) {
        this.card = card;
        return this;
    }

    public OrderDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public OrderDto setPrice(double price) {
        this.price = price;
        return this;
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
