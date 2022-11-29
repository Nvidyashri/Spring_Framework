package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temples {
	@Autowired
	private String templeName;
	@Autowired
	private String templePlace;
	@Autowired
	TempleAutowired temp;
	
	public Temples() {
		System.out.println("default constr found......");
	}

	public String getTempleName() {
		return templeName;
	}

	public String getTemplePlace() {
		return templePlace;
	}
	public void displyTempleAutowired() {
		System.out.println("God name" +temp.getGodName());
		System.out.println("donation Counter" + temp.isDonationCounter());
	}

}
