package com.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.entities.Product;
import com.shop.repositories.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}
	
	public void deleteProduct(int id) {
		productRepo.deleteById(id);
	}
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
}
