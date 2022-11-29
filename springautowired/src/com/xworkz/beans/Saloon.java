package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // create and register to spring
public class Saloon {

	private String ownerName;
	private double rent;
	
	@Autowired //has a relationship
	
	private Tv tv;
    private Doctor dr;
	public String getOwnerName() {
		return ownerName;
	}

	public double getRent() {
		return rent;
	}

	public void displyTvDetails() {
		System.out.println(tv.getOwnerName());
		System.out.println(tv.getBrand());
	}
	

	
	
	
	
}
