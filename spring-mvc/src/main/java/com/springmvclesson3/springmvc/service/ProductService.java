package com.springmvclesson3.springmvc.service;

import com.springmvclesson3.springmvc.domain.Product;
import com.springmvclesson3.springmvc.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> getAll ();

    Optional<Product> findByID(long id);

    Product create (Product product);
}
