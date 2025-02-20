package com.mtoaima.springrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtoaima.springrest.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
