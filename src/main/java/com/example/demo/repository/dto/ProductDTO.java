package com.example.demo.repository.dto;

import com.example.demo.model.Product;


public class ProductDTO
{
   public Product p;

public ProductDTO(Product p) {
	super();
	this.p = p;
}

public ProductDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public Product getP() {
	return p;
}

public void setP(Product p) {
	this.p = p;
}


   
   
	
}
