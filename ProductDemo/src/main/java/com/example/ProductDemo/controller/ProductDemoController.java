package com.example.ProductDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductDemo.domain.Product;
import com.example.ProductDemo.service.ProductDemoService;

@RestController
@RequestMapping("/api/v1")
public class ProductDemoController {

	@Autowired
	private ProductDemoService productservice;

//	private ProductDemoService productServiceImpl;
//
//	@Autowired
//	public ProductDemoController(ProductDemoService productServiceImpl) {
//		this.productServiceImpl = productServiceImpl;
//	}

	/*
	 * public ResponseEntity<?> getAllProducts(){
	 * 
	 * List<Product> productList; try{ if((productList=
	 * productServiceImpl.getAllProducts())!=null){
	 * 
	 * return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	 * 
	 * } else{ throw new ProductNotFoundException(); } }
	 * 
	 * 
	 * catch(ProductNotFoundException e){ return new
	 * ResponseEntity<String>(e.toString(),HttpStatus.OK);
	 * 
	 * // ReflectionUtils.rethrowRuntimeException(e);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */
	@RequestMapping(value = "/saveprods", method = RequestMethod.POST)
	public Product savedetails(@RequestBody Product input) {
		Product response = productservice.savedetails(input);
		return response;

	}
	
	@RequestMapping(value ="/getprods", method= RequestMethod.GET)
	public List<Product> getdetails() {
		
		List<Product> res= productservice.getdetails();
		return res;
		
	}
	

//public String hello() {
//	
//	
//	return "hi";
//}

}
