package com.example.apiproducts.repository;

import com.example.apiproducts.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends CrudRepository <Product, String> {
}
