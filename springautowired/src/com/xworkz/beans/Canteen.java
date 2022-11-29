package com.xworkz.beans;

import org.springframework.stereotype.Component;

@Component
public class Canteen {

	private String noOfChefs;
	private double chefSalary;

	public double getChefSalary() {
		return chefSalary;
	}

	public String getNoOfChefs() {
		return noOfChefs;
	}
}
