package com.E052.db.client.Controller;

import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.model.cart;
import com.E052.db.Admin.model.customerorder;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.repository.CartRepository;
import com.E052.db.Admin.repository.OrderRepository;
import com.E052.db.Admin.repository.ProductRepository;
import com.E052.db.Admin.service.BrandServiceImpl;
import com.E052.db.Admin.service.CategoryServiceImpl;
import com.E052.db.client.model.User;
import com.E052.db.client.repository.UserRepository;
import com.E052.db.client.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    BrandServiceImpl brandService;

    public User getuser=new User();


    @GetMapping("/login")
    public String login() {
        return "login";
    }
@GetMapping("/")
    public String home(Model model){
    model.addAttribute("category",categoryService.getAllcategories());
    model.addAttribute("brand",brandService.getAllbrands());
    model.addAttribute("user",userRepository.findByEmail(userService.newUser));

    if(userService.newUser.equals("admin@techworld.com")){
        List<customerorder> allCart=orderRepository.findAll();
        model.addAttribute("orders",allCart);
        getuser=userRepository.findByEmail(userService.newUser);

        return "adminindex";
    }
    else{
        return "index";
    }

}
@GetMapping("/listorder")
public String listorder(Model model){
    List<customerorder> allCart=orderRepository.findAll();
    model.addAttribute("orders",allCart);
        return "adminindex";

}

    @GetMapping("/adminDetails")
    public String adminDetails(Model model){

        model.addAttribute("user",getuser);
        System.out.println("sssssssssssssssssssssssssss"+ getuser.getEmail());

        return "adminDetails";
    }


}