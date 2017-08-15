package com.infra.service;

import com.infra.domain.Product;
import com.infra.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductService{

    @Autowired
    private ProductRepository productRepository;

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(35.75d,1000,"descricao 1","produto 1"));
        products.add(new Product(45.50d,500,"descricao 1","produto 1"));
        products.add(new Product(1500.0d,100,"descricao 1","produto 1"));
        products.add(new Product(1000.0d,400,"descricao 1","produto 1"));
        products.add(new Product(450.0d,800,"descricao 1","produto 1"));
        products.add(new Product(2500.0d,800,"descricao 1","produto 1"));
        products.add(new Product(45000.0d,800,"descricao 1","produto 1"));
        products.add(new Product(300.0d,800,"descricao 1","produto 1"));
        products.add(new Product(550.0d,800,"descricao 1","produto 1"));
        products.add(new Product(85000.0d,800,"descricao 1","produto 1"));
    }

    public void saveInitialBatch(){
        productRepository.save(products);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
