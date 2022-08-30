package com.E052.db.Admin.controller;

import com.E052.db.Admin.dto.ProductDto;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.CategoryRepository;
import com.E052.db.Admin.repository.ProductRepository;
import com.E052.db.Admin.service.BrandService;
import com.E052.db.Admin.service.BrandServiceImpl;
import com.E052.db.Admin.service.CategoryServiceImpl;
import com.E052.db.Admin.service.ProductService;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


@Controller
@RequestMapping("/addproduct")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private BrandServiceImpl brandService;


    @PostMapping
    public String AddProduct(@ModelAttribute("product") ProductDto registrationDto) {
        product newProduct = new product();
        String fileName=StringUtils.cleanPath(registrationDto.getImage().getOriginalFilename());
        if(fileName.contains("..")){
            System.out.println("not a proper file");
        }

        newProduct.setName(registrationDto.getName());
       newProduct.setDescription(registrationDto.getDescription());
       newProduct.setPrice(registrationDto.getPrice());
       newProduct.setCategory_id(registrationDto.getCategory_id());
       newProduct.setBrand_id(registrationDto.getBrand_id());
        try {
            newProduct.setImage(Base64.getEncoder().encodeToString(registrationDto.getImage().getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        newProduct.setModel(registrationDto.getModel());

       productRepository.save(newProduct);
        return "redirect:/listproduct";
    }



    @ModelAttribute("product")
    public ProductDto productRegistrationDto() {
        return new ProductDto();
    }

    @GetMapping()
    public String showRegistrationForm(Model model) {


        model.addAttribute("category",categoryService.getAllcategories());
        model.addAttribute("brand",brandService.getAllbrands());
        return "addproduct";
    }


    public ProductController setProductService(ProductService productService) {
        this.productService = productService;
        return this;
    }



}
