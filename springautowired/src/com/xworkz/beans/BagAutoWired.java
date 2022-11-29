package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BagAutoWired {
	
	@Autowired
	private int noOfPens;
	@Autowired
	private int noOfPencils;
	public int getNoOfPens() {
		return noOfPens;
	}
	public int getNoOfPencils() {
		return noOfPencils;
	}

}
