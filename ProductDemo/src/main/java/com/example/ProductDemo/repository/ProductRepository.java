package com.example.ProductDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductDemo.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
//	public Product getProductId(int productId);
//	
//	public List<Product> getProductByName(String productName);
//	
//	public List<Product> getProductByPrice(String productPrice);
	
	

}
