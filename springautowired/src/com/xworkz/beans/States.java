package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class States {
	
	@Autowired
	private String nameOfTheStates;
	@Autowired
	private double noOfDistic;
	@Autowired
	private Bengalore bengalore;
	
	
		
	public String getNameOfTheStates() {
		return nameOfTheStates;
	}



	public double getNoOfDistic() {
		return noOfDistic;
	}
	
	public void showBengaloreDetailes() {
		System.out.println(bengalore.getBengaloreIs());
		System.out.println(bengalore.getOriginalName());
		
	}
	
	

}
