package com.springcore;

public class ProductServiceImpl  implements ProductService {
	private String product;
	public ProductServiceImpl() {
		
	}
	public ProductServiceImpl(String product) {
		this.product=product;
	}
	
	public void setProduct(String product) {
		this.product=product;
	}
	public void allProducts() {
		System.out.println("Product Name : "+product);
	}

}
