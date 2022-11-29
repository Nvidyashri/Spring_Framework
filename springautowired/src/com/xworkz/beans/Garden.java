package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Garden {
	@Autowired
	private double noOfTree;

	public double getNoOfTree() {
		return noOfTree;
	}
	
	
	

}
