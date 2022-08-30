package com.E052.db.Admin.service;


import com.E052.db.Admin.dto.CategoryDto;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;



    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public category save(CategoryDto registrationDto) {
        category Category = new category(registrationDto.getName(),registrationDto.getDescription()
        );

        return categoryRepository.save(Category);
    }
    public List<category> getAllcategories(){
        return categoryRepository.findAll();

    }

}
