package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.model.cart;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.repository.CartRepository;
import com.E052.db.Admin.repository.CategoryRepository;
import com.E052.db.Admin.repository.ProductRepository;
import com.E052.db.Admin.service.CartServiceImpl;
import com.E052.db.Admin.service.CategoryServiceImpl;
import com.E052.db.client.model.User;
import com.E052.db.client.repository.UserRepository;
import com.E052.db.client.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private CartServiceImpl cartService;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/listbrand")
    public String showBrands(Model model) {
        List<brand> brands = brandRepository.findAll();
        model.addAttribute("brand",brands);

        return "listbrand";
    }
    @GetMapping("/deleteBrand/{id}")
    public String deletebrand(@PathVariable("id") Integer id) {
        brandRepository.deleteById(id);
        return "redirect:/listbrand";
    }

    @GetMapping("/listcategory")
    public String showCategory(Model model) {
        List<category> categories = categoryRepository.findAll();
        model.addAttribute("category",categories);
        return "listcategory";
    }

    @GetMapping("/deleteCategory/{id}")
    public String deleteCategory(@PathVariable("id") Integer id) {
        categoryRepository.deleteById(id);
        return "redirect:/listcategory";
    }

    @GetMapping("/listproduct")
    public String showProducts(Model model) {
        List<product> products = productRepository.findAll();
        model.addAttribute("product", products);

        return "listproduct";
    }
    @GetMapping("/deleteProduct/{id}")
    public String deleteproduct(@PathVariable("id") Integer id) {
        productRepository.deleteById(id);
        return "redirect:/listproduct";
    }
    @GetMapping("/cartlist")
    public String showCart(Model model) {
        User newuser=new User();
        newuser=userRepository.findByEmail(userService.newUser);

        List<cart> findBycustomer=cartRepository.getAllByName(newuser.getId());

        product Product=productRepository.getById(cartService.ProductID);
        double totalPrice=0;

  for(int i=0;i<findBycustomer.size();i++){
       totalPrice=totalPrice+findBycustomer.get(i).getPrice();
  }
        cartService.getCartprice(totalPrice);
   model.addAttribute("product",Product);
        model.addAttribute("cart",findBycustomer);
        model.addAttribute("totalprice",totalPrice);
        return "cartlist";
    }

    @GetMapping("/deleteCart/{id}")
    public String deleteCart(@PathVariable("id")int id) {
        cartRepository.deleteById(id);
        return "redirect:/cartlist";
    }



    @GetMapping("/filter/{id}")
    public String Filter(@PathVariable("id")int id, ModelMap model) {
        List<product> getAllBycategory=categoryRepository.getAllBycategory(id);
        model.addAttribute("category",categoryService.getAllcategories());
        return "filterbycategory";
    }




}
