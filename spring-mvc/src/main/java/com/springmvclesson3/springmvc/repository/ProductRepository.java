package com.springmvclesson3.springmvc.repository;

import com.springmvclesson3.springmvc.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();

    Optional<Product> findByID(long id);

    Product add (Product product);
}
