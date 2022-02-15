package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ModelType;
import com.example.demo.model.Product;
import com.example.demo.repository.ModelRepo;

@Service
public class ModelService {

	@Autowired
	public ModelRepo mrepo;
	
	public List<ModelType> getAllmodels()
	{
		return mrepo.findAll();
	}
}
