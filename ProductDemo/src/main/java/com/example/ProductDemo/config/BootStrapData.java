//package com.example.ProductDemo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.event.ContextRefreshedEvent;
//
//import com.example.ProductDemo.domain.Product;
//import com.example.ProductDemo.repository.ProductRepository;
//
//@Configuration
//public class BootStrapData implements ApplicationListener<ContextRefreshedEvent> {
//
//	private ProductRepository productRepo;
//
//	@Autowired
//	public BootStrapData(ProductRepository productRepo) {
//		this.productRepo = productRepo;
//	}
//
//	@Override
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//
//		Product prod1 = new Product(1, "Apple", "50");
//		productRepo.save(prod1);
//		
//		Product prod2 = new Product(2, "Bat", "1000");
//		productRepo.save(prod2);
//		
//		Product prod3 = new Product(3, "Gun", "100");
//		productRepo.save(prod3);
//		
//		Product prod4 = new Product(4, "Flower", "70");
//		productRepo.save(prod4);
//		
//		Product prod5 = new Product(5, "Pen", "20");
//		productRepo.save(prod5);
//
//		Product prod6 = new Product(6, "Slate", "40");
//		productRepo.save(prod6);
//		
//		Product prod7 = new Product(7, "Biscuit", "150");
//		productRepo.save(prod7);
//	}
//
//}
