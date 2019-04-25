package com.example.ProductDemo.exception;

public class ProductNotFoundException extends Exception {

	int productId;
	String productName;

	public ProductNotFoundException() {

	}

	public ProductNotFoundException(int productId) {
		this.productId = productId;
	}

	public ProductNotFoundException(String productName) {
		this.productName = productName;

	}

	public String toString() {

		return "products not found";
	}

}
