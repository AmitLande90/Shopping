package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.entities.Product;
import com.shop.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;

	@PostMapping("/shop/addProduct")
	public Product addProduct(@RequestBody Product product) {		
		return service.addProduct(product);
	}
	
	@PutMapping("/shop/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/shop/deleteProduct/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
	
	@GetMapping("/shop/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
}
