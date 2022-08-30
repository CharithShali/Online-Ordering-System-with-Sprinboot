package com.E052.db.Admin.service;

import com.E052.db.Admin.dto.ProductDto;
import com.E052.db.Admin.model.product;
import com.E052.db.Admin.repository.ProductRepository;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public product save(ProductDto registrationDto) throws IOException {
        return null;
    }
    public List<product> listall(String keyword){
        if(keyword !=null){
            return productRepository.findAll(keyword);
        }
        return productRepository.findAll();
    }


}
