package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Product;
import com.example.demo.repository.dto.ProductDTO;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService ps;
	
	@GetMapping("/api/getproducts")
	public List<Product> getAllproducts()
	{
		return ps.getAllproducts();
	}
	
	@PostMapping("/api/productentry")
	public Product productentry(@RequestBody Product p )
	{
	    return ps.productentry(p);
		//URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newp.getProductid()).toUri();
		//return ResponseEntity.created(uri).body(newp);
		
	}
}
