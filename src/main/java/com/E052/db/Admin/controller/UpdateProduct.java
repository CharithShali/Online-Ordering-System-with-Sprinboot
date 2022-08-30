package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.dto.ProductDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.repository.CategoryRepository;
import com.E052.db.Admin.repository.ProductRepository;
import com.E052.db.Admin.service.BrandService;
import com.E052.db.Admin.service.BrandServiceImpl;
import com.E052.db.Admin.service.CategoryService;
import com.E052.db.Admin.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Base64;

@Controller
@RequestMapping("/updateProduct/{id}")
public class UpdateProduct {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private CategoryServiceImpl categoryService;
    @Autowired
    private BrandServiceImpl brandService;

    @GetMapping
    public String returnProductUpdate(Model model, @PathVariable int id){
        model.addAttribute("product",productRepository.getById(id));
        model.addAttribute("category",categoryService.getAllcategories());
        model.addAttribute("brand",brandService.getAllbrands());
        return "updateproduct";
    }

    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public String AddBrand(@ModelAttribute("product") ProductDto registrationDto, @PathVariable int id)
    {

        product newProduct= new product();
        newProduct=productRepository.getById(id);
        newProduct.setPrice(registrationDto.getPrice());
        newProduct.setDescription(registrationDto.getDescription());
        newProduct.setName(registrationDto.getName());
        newProduct.setModel(registrationDto.getModel());
        newProduct.setBrand_id(registrationDto.getBrand_id());
        newProduct.setCategory_id(registrationDto.getCategory_id());

        productRepository.save(newProduct);
        return "redirect:/listproduct";
    }

}
