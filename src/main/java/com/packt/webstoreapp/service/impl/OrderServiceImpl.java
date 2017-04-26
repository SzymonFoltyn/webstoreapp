package com.packt.webstoreapp.service.impl;

import com.packt.webstoreapp.domain.Product;
import com.packt.webstoreapp.domain.repository.ProductRepository;
import com.packt.webstoreapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Szymon on 2017-04-26.
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductRepository productRepository;

    public void processOrder(String productId, int count) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < count) {
            throw new IllegalArgumentException("Za mało towaru, Dostępna ilość to: " + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
