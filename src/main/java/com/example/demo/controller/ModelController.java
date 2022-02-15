package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ModelType;
import com.example.demo.service.ModelService;

@RestController
public class ModelController {
	
	@Autowired
	public ModelService ms;
	
	@GetMapping("/api/getmodels")
	public List<ModelType> getAllmodels()
	{
		return ms.getAllmodels();
	}

}
