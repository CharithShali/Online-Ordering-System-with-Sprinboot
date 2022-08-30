package com.E052.db.Admin.service;

import com.E052.db.Admin.dto.OrderDto;
import com.E052.db.Admin.model.customerorder;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {

    public String paymentMethod;
    public double Price;
    @Override
    public customerorder save(OrderDto registrationDto) {
        return null;
    }

    public void cartprice(double price){
        Price=price;

    }

    public void paymentMethod(String pay){
        paymentMethod=pay;
    }

}
