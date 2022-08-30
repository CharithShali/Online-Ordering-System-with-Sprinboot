package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.dto.CategoryDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.repository.CategoryRepository;
import com.E052.db.Admin.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/addcategory")
public class CategoryController {
    @Autowired
    private BrandService brandService;
    @Autowired
    private CategoryRepository categoryRepository;


    @PostMapping
    public String AddCategory(@ModelAttribute("category") CategoryDto registrationDto) {
       category newCategory = new category();
        newCategory.setName(registrationDto.getName());
        newCategory.setDescription(registrationDto.getDescription());
        categoryRepository.save(newCategory);
        return "redirect:/listcategory";
    }

    @ModelAttribute("category")
    public CategoryDto categoryRegistrationDto() {
        return new CategoryDto();
    }

    @GetMapping
    public String showRegistrationForm() {


        return "addcategory";
    }


}
