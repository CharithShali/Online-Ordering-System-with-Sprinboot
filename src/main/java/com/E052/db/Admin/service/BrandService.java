package com.E052.db.Admin.service;

import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.model.brand;


public interface BrandService {
    brand save(BrandDto registrationDto);
}
