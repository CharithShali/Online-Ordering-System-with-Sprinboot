package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.repository.BrandRepository;
import com.E052.db.Admin.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/addbrand")
public class BrandController {
  @Autowired
private BrandService brandService;

    @Autowired
    private BrandRepository brandRepository;

    public BrandController setBrandRepository(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
        return this;
    }


    @PostMapping
    public String AddBrand(@ModelAttribute("brand")BrandDto registrationDto) {
        brand newBrand=new brand();
        newBrand.setName(registrationDto.getName());
        newBrand.setDescription(registrationDto.getDescription());
       brandRepository.save(newBrand);
        return "redirect:/listbrand";
    }

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @ModelAttribute("brand")
    public BrandDto brandRegistrationDto() {
        return new BrandDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "addbrand";
    }


}
