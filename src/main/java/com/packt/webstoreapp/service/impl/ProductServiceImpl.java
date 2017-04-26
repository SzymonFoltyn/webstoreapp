package com.packt.webstoreapp.service.impl;

import com.packt.webstoreapp.domain.Product;
import com.packt.webstoreapp.domain.repository.ProductRepository;
import com.packt.webstoreapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Szymon on 2017-04-26.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
