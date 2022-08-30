package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.CartDto;
import com.E052.db.Admin.model.cart;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.repository.CartRepository;
import com.E052.db.Admin.repository.CategoryRepository;
import com.E052.db.Admin.repository.ProductRepository;
import com.E052.db.Admin.service.CartServiceImpl;
import com.E052.db.Admin.service.OrdersServiceImpl;
import com.E052.db.client.model.User;
import com.E052.db.client.repository.UserRepository;
import com.E052.db.client.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CartController {

    private product Product;


    @Autowired
    private OrdersServiceImpl pendingOrdersService;

   @Autowired
   private BrandRepository brandRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;


    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartServiceImpl cartService;

    @Autowired

    @ModelAttribute("cart")
    public CartDto categorygistrationDto() {
        return new CartDto();
    }





    @PostMapping("/CART")
    public String AddCategory(Model model,@ModelAttribute("cart") CartDto registrationDto) {
        cart newCart = new cart();
        User newuser=new User();
        newuser=userRepository.findByEmail(userService.newUser);
        newCart.setProduct_id(registrationDto.getProduct_id());
        newCart.setImage(productRepository.getById(registrationDto.getProduct_id()).getImage());
       newCart.setCustomer_id(newuser.getId());
       newCart.setQuantity(registrationDto.getQuantity());
       newCart.setPrice(registrationDto.getQuantity()*registrationDto.getPrice());
        pendingOrdersService.cartprice(registrationDto.getQuantity()*registrationDto.getPrice());
        cartRepo.save(newCart);
        return "redirect:/cartlist";
    }



    @GetMapping("/CART")
    public String showCartForm(Model model) {
        product Product=productRepository.getById(cartService.ProductID);
        model.addAttribute("product",Product);
        return "CART";
    }

    @GetMapping("/detail/{id}")
    public String showIndex(@PathVariable("id") Integer id, Model model){
        Product=productRepository.getById(id);
        model.addAttribute("product",Product);
        model.addAttribute("brand",brandRepository.getById(Product.getBrand_id()));
        model.addAttribute("category",categoryRepository.getById(Product.getCategory_id()));

        cartService.getProduct(id);
        return "details";

    }

}



