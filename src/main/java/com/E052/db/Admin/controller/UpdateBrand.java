package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/updateBrand/{id}")
public class UpdateBrand  {


@GetMapping
public String returnupdate(Model model,@PathVariable int id){
    model.addAttribute("brand",brandRepository.getById(id));
    return "updatebrand";
}

    @Autowired
    private BrandRepository brandRepository;
    @PostMapping
    public String AddBrand(@ModelAttribute("brand")BrandDto registrationDto,@PathVariable int id)
   {

       brand Brand;
       Brand=brandRepository.getById(id);
       Brand.setName(registrationDto.getName());
       Brand.setDescription(registrationDto.getDescription());
       brandRepository.save(Brand);
        return "redirect:/listbrand";
    }

}
