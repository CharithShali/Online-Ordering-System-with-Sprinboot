package com.E052.db.Admin.controller;

import com.E052.db.Admin.model.product;
import com.E052.db.Admin.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private ProductServiceImpl productService;

@RequestMapping("/search")
    public String search(Model model, @Param("keyword") String keyword){
    String Keyword=keyword;
    System.out.println("dddddddddddddddddddddddddddddddddddddddddddd"+ Keyword);
    List<product> listProduct=productService.listall(Keyword);


    model.addAttribute("product",listProduct);
model.addAttribute("keyword",Keyword);

    return "search";
}
@GetMapping("/search")
    public String reSearch(@Param("keyword") String keyword,Model model){
    System.out.println("keyword = xxxxxxxxxxx" +keyword);
    String Keyword=keyword;
    System.out.println("dddddddddddddddddddddddddddddddddddddddddddd"+ Keyword);
    List<product> listProduct=productService.listall(Keyword);


    model.addAttribute("product",listProduct);
    model.addAttribute("keyword",Keyword);
    return "search";
}
}
