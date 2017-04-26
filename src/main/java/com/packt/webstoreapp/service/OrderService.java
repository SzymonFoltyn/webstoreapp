package com.packt.webstoreapp.service;

/**
 * Created by Szymon on 2017-04-26.
 */
public interface OrderService {

    void processOrder(String productId, int count);

}
