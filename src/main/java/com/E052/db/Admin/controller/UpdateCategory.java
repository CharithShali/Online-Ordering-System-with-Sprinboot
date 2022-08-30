package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.dto.CategoryDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.repository.CartRepository;
import com.E052.db.Admin.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/updateCategory/{id}")
public class UpdateCategory  {

@Autowired
private CategoryRepository categoryRepository;
    @GetMapping
    public String returnupdate(Model model,@PathVariable int id){
        model.addAttribute("category",categoryRepository.getById(id));
        return "updatecategory";
    }

    @PostMapping
    public String AddBrand(@ModelAttribute("category") CategoryDto registrationDto, @PathVariable int id)
    {

        category Category;
        Category=categoryRepository.getById(id);
        Category.setName(registrationDto.getName());
        Category.setDescription(registrationDto.getDescription());
        categoryRepository.save(Category);
        return "redirect:/listcategory";
    }

}
