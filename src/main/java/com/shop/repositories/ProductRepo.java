package com.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
