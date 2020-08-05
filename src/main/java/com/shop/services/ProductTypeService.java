package com.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.entities.ProductType;
import com.shop.repositories.ProductTypeRepo;

@Service
public class ProductTypeService {
	@Autowired
	private ProductTypeRepo typeRepo;	
	
	public List<ProductType> getAllProdTypes(){
		return typeRepo.findAll();
	}
	
	public ProductType addProdType(ProductType productType) {
		return typeRepo.save(productType);
	}
	
	public ProductType updateProdType(ProductType productType) {
		return typeRepo.save(productType);
	}
	
	public void deleteProdType(int id) {
		typeRepo.deleteById(id);
	}
}
