package com.example.ProductDemo.service;

import java.util.List;

import com.example.ProductDemo.domain.Product;

public interface ProductDemoService {
	public Product savedetails(Product input);
	public List<Product> getdetails();
	

//	public List<Product> getAllProducts();

}
