package com.E052.db.Admin.model;

public class order_customer {
    private String name;
    private String method;
    private String address;
    private Double price;
    private String status;

    public order_customer() {
    }

    public order_customer(String name, String method, String address, Double price, String status) {

        this.name = name;
        this.method = method;
        this.address = address;
        this.price = price;
        this.status = status;
    }

    public order_customer setName(String name) {
        this.name = name;
        return this;
    }

    public order_customer setMethod(String method) {
        this.method = method;
        return this;
    }

    public order_customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public order_customer setPrice(Double price) {
        this.price = price;
        return this;
    }

    public order_customer setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getMethod() {
        return method;
    }

    public String getAddress() {
        return address;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
