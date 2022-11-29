package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Home {
	
	@Autowired
	private double noOfDoors;
	@Autowired
	private double noOFWindows;
	
	@Autowired
	private Bathroom bathroom;

	public double getNoOfDoors() {
		return noOfDoors;
	}

	public double getNoOFWindows() {
		return noOFWindows;
	}

	public Bathroom getBathroom() {
		return bathroom;
	}
	
	public void desplyBathroom() {
		System.out.println(bathroom.getNoOfBukets());
		System.out.println(bathroom.getNoOfMirror());
	}

}