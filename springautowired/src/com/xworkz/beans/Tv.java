package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //create and register to spring
public class Tv {
	@Autowired 
	private String brand;
	@Autowired
	private String ownerName;
	
	public String getBrand() {
		return brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	
	

}
