package com.packt.webstoreapp.domain.repository;

import com.packt.webstoreapp.domain.Product;

import java.util.List;

/**
 * Created by Szymon on 2017-04-25.
 */
public interface ProductRepository {

    List<Product> getAllProducts();
}
