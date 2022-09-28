package com.springmvclesson3.springmvc.repository.Impl;

import com.springmvclesson3.springmvc.domain.Product;
import com.springmvclesson3.springmvc.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private ArrayList<Product> products;
    private final Random random = new Random();
    private long curIdNumber;

    @PostConstruct
    void init(){
    products = new ArrayList<>();
    for (int i = 1; i<=5; i++){
        curIdNumber++;
        products.add(new Product(curIdNumber,"Product "+curIdNumber,random.nextInt()*i*1000));
    }
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Optional<Product> findByID(long id) {
        for (Product product: products) {
            if(product.getId() == id){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @Override
    public Product add(Product newProduct) {
        Optional<Product> mayBeExistingProduct = products.stream().
                filter(curProduct -> curProduct.getTitle().equals(newProduct.getTitle())).
                findFirst();
        if(mayBeExistingProduct.isPresent()){
            Product existingProduct = mayBeExistingProduct.get();
            existingProduct.setTitle(newProduct.getTitle());
            existingProduct.setCost(newProduct.getCost());
        }
        else
        {
            curIdNumber++;
            newProduct.setId(curIdNumber);
            products.add(newProduct);

        }
        return newProduct;
    }
}
