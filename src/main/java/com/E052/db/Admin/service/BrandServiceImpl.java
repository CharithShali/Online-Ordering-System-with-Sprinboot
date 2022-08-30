package com.E052.db.Admin.service;


import com.E052.db.Admin.dto.BrandDto;
import com.E052.db.Admin.model.brand;
import com.E052.db.Admin.model.category;
import com.E052.db.Admin.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BrandServiceImpl implements BrandService{

    private BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public brand save(BrandDto registrationDto) {
       brand brand = new brand(registrationDto.getName(),registrationDto.getDescription()
                );

        return brandRepository.save(brand);
    }

    public List<brand> getAllbrands(){
        return brandRepository.findAll();

    }


}
