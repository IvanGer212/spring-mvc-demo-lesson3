package com.springmvclesson3.springmvc.service.Impl;

import com.springmvclesson3.springmvc.domain.Product;
import com.springmvclesson3.springmvc.repository.ProductRepository;
import com.springmvclesson3.springmvc.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public Optional<Product> findByID(long id) {
        return repository.findByID(id);
    }

    @Override
    public Product create(Product product) {
        return null;
    }
}
