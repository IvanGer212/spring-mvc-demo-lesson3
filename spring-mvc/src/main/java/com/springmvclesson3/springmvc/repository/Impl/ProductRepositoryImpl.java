package com.springmvclesson3.springmvc.repository.Impl;

import com.springmvclesson3.springmvc.domain.Product;
import com.springmvclesson3.springmvc.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository {

    ArrayList<Product> products;

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Optional<Product> findByID(long id) {
        return Optional.empty();
    }

    @Override
    public Product add(Product product) {
        return null;
    }
}
