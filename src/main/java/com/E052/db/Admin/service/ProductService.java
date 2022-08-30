package com.E052.db.Admin.service;

import com.E052.db.Admin.dto.ProductDto;
import com.E052.db.Admin.model.product;

import java.io.IOException;

public interface ProductService  {
    product save(ProductDto registrationDto) throws IOException;
}
