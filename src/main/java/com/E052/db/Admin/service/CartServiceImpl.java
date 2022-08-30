package com.E052.db.Admin.service;

import com.E052.db.Admin.dto.CartDto;
import com.E052.db.Admin.model.cart;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.CartRepository;
import com.E052.db.Admin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    private CartRepository cartRepository;
    public int ProductID;
    public double Price;


    @Autowired
    private ProductRepository productRepository;
    @Override
    public cart save(CartDto registrationDto) {
        cart Cart = new cart(registrationDto.getCustomer_id(),registrationDto.getProduct_id(),registrationDto.getQuantity(),
                registrationDto.getPrice());

        return cartRepository.save(Cart);
    }
    public void getProduct(int Pid){
       ProductID=Pid;

    }

    public void getCartprice(double price){
        Price=price;
    }
}
