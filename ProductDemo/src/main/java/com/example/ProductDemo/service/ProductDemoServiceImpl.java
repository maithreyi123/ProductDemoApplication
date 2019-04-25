package com.example.ProductDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductDemo.domain.Product;
import com.example.ProductDemo.repository.ProductRepository;

@Service
public class ProductDemoServiceImpl implements ProductDemoService {

	@Autowired
	private ProductRepository repo;

	@Override
	public Product savedetails(Product input) {

		Product response = repo.save(input);
		return response;

	}

//	private ProductRepository productRepo;
//	
//	@Autowired
//	public ProductDemoServiceImpl(ProductRepository productRepo){
//		this.productRepo=productRepo;
//	}
//	
//	@Override
//	public List<Product> getAllProducts() {
//		
//		List<Product> productList = (List<Product>)productRepo.findAll();
//		if(productList.isEmpty()){
//			return null;
//		
//		}
//		return productList;
//	}	
	@Override
	public List<Product> getdetails(){
		List<Product> resp = (List<Product>) repo.findAll();
		return resp;
	}
	
	
}
