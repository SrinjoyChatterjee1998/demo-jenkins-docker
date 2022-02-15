package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ModelType {
	
	@Id
	int modelid;
	String modelname;
	float rating;
	
	
	public ModelType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelType(int modelid, String modelname, float rating) {
		super();
		this.modelid = modelid;
		this.modelname = modelname;
		this.rating = rating;
	}

	public ModelType(String modelname, float rating) {
		super();
		this.modelname = modelname;
		this.rating = rating;
	}



	public int getModelid() {
		return modelid;
	}

	public void setModelid(int modelid) {
		this.modelid = modelid;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	/*public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	*/
	

}
