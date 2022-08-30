package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.OrderDto;
import com.E052.db.Admin.model.cart;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.customerorder;
import com.E052.db.Admin.repository.OrderRepository;
import com.E052.db.Admin.service.CartServiceImpl;
import com.E052.db.Admin.service.OrdersServiceImpl;
import com.E052.db.client.model.User;
import com.E052.db.client.repository.UserRepository;
import com.E052.db.client.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartServiceImpl cartService;
    @Autowired
    private OrdersServiceImpl ordersService;


    @ModelAttribute("Order")
    public OrderDto AddAOrderDto() {
        return new OrderDto();
    }


    @GetMapping("/addorder")
    public String showaAddBrand() {
        return "addorder";
    }

    @PostMapping("/addNewOrder")
    public String Addtoorder(@ModelAttribute("Order") OrderDto registrationDto) {




        customerorder newCustomerorder = new customerorder();
        User newUSer=userRepository.findByEmail(userService.newUser);




        System.out.println("ssssssssssssssssssssssssss "+newUSer.getId());
        newCustomerorder.setMethod("Visa");
        newCustomerorder.setCustomer_id(newUSer.getId());
        newCustomerorder.setPrice(cartService.Price);
        newCustomerorder.setStatus("Pending");
        newCustomerorder.setAddress(registrationDto.getAddress());
        newCustomerorder.setCard(registrationDto.getCard());
        orderRepository.save(newCustomerorder);


        return "redirect:/cartlist";
    }


}
