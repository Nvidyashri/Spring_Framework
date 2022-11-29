package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bathroom {
	@Autowired
	private double noOfBukets;
	@Autowired
	private double noOfMirror;

	public double getNoOfBukets() {
		return noOfBukets;
	}

	public double getNoOfMirror() {
		return noOfMirror;
	}

}
