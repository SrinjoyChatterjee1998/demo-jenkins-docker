package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ModelRepo;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.dto.ProductDTO;

@Service
public class ProductService {

	@Autowired
	public ProductRepo prepo;
	
	@Autowired
	public ModelRepo mrepo;
	
	public Product productentry(Product p)
	{
		return prepo.save(p);
	}
	
	public List<Product> getAllproducts()
	{
		return prepo.findAll();
	}
}   
