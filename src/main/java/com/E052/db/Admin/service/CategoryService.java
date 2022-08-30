package com.E052.db.Admin.service;


import com.E052.db.Admin.dto.CategoryDto;
import com.E052.db.Admin.model.category;

public interface CategoryService {
    category save(CategoryDto registrationDto);
}
