package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int productid;
	String productname;
	
    @OneToMany(targetEntity = ModelType.class,cascade = CascadeType.ALL)
    @JoinColumn(name= "p_fk", referencedColumnName ="productid")
	List<ModelType> models =new ArrayList<>();
	
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}
	
	
	public Product(String productname) {
		super();
		this.productname = productname;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<ModelType> getModels() {
		return models;
	}

	public void setModels(List<ModelType> models) {
		this.models = models;
	}
	
	

}
