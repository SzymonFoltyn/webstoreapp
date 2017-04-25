package com.packt.webstoreapp.domain.repository.impl;

import com.packt.webstoreapp.domain.Product;
import com.packt.webstoreapp.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szymon on 2017-04-25.
 */

@Repository
public class InMemoryProductRepository implements ProductRepository{
    
    private List<Product> listOfProducts = new ArrayList<Product>();

    public InMemoryProductRepository() {

        Product lowShoes = new Product("S100", "Salewa GTX Low", new BigDecimal(987));
        lowShoes.setDescription("Niskie buty podejściowe z podeszwą Vibram i membraną Gore-Tex");
        lowShoes.setCategory("Low Shoes");
        lowShoes.setManufacturer("Salewa");
        lowShoes.setUnitsInStock(100);
        
        Product jacket = new Product("S100", "Kurtka TNF Himalaya", new BigDecimal(1456));
        jacket.setDescription("Lekka kurtka wspinaczkowa z membraną Gore-Tex");
        jacket.setCategory("jacket");
        jacket.setManufacturer("The North Face");
        jacket.setUnitsInStock(25);
        
        Product highShoes = new Product("H100", "Salewa GTX High", new BigDecimal(1456));
        highShoes.setDescription("Wysokie buty podejściowe z podeszwą Vibram i membraną Gore-Tex");
        highShoes.setCategory("High Shoes");
        highShoes.setManufacturer("Salewa");
        highShoes.setUnitsInStock(30);

        listOfProducts.add(lowShoes);
        listOfProducts.add(jacket);
        listOfProducts.add(highShoes);
        
    }

    public List<Product> getAllProducts() {
        return listOfProducts;
    }
}
