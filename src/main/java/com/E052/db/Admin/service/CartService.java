package com.E052.db.Admin.service;


import com.E052.db.Admin.dto.CartDto;
import com.E052.db.Admin.model.cart;

public interface CartService {
    cart save(CartDto registrationDto);

}
