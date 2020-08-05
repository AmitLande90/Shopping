package com.shop.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "prod_type")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int typid;
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "productType")
	private Set<Product> products;
}
