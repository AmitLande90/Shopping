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

import com.shop.entities.ProductType;
import com.shop.services.ProductTypeService;

@RestController
public class ProductTypeController {
	
	@Autowired
	ProductTypeService service;
	
	@GetMapping("/shop/ProdTypes")
	public List<ProductType> getAllProdTypes(){
		return service.getAllProdTypes();
	}
	
	@PostMapping("/shop/addProdType")
	public ProductType addProdType(@RequestBody ProductType productType) {
		return service.addProdType(productType);
	}
	
	@PutMapping("/shop/updateProdType")
	public ProductType updateProdType(@RequestBody ProductType productType) {
		return service.updateProdType(productType);
	}
	
	@DeleteMapping("shop/deleteProdType/{id}")
	public void deleteProdType(@PathVariable int id) {
		service.deleteProdType(id);
	}
}
