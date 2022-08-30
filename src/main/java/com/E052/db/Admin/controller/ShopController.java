package com.E052.db.Admin.controller;

import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.repository.CategoryRepository;
import com.E052.db.Admin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ShopController {

   public product Product=new product();

@Autowired
private ProductRepository productRepository;

@Autowired
private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping("/products")
    public String Products(ModelMap model){
        List<product> products=productRepository.findAll();
        List<category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("products",products);

        return "products";
    }

}
