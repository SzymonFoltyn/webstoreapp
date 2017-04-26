package com.packt.webstoreapp.service;

import com.packt.webstoreapp.domain.Product;

import java.util.List;

/**
 * Created by Szymon on 2017-04-26.
 */
public interface ProductService {

    List<Product> getAllProducts();
}
