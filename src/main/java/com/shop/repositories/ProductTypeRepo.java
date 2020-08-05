package com.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.entities.ProductType;

@Repository
public interface ProductTypeRepo extends JpaRepository<ProductType, Integer>{

}
