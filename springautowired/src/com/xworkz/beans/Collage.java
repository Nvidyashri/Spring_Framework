package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Collage {
	
	@Autowired
	private String collageName;
	@Autowired
	private String area;
	@Autowired
	private Garden garden;
	
	public String getCollageName() {
		return collageName;
	}
	public String getArea() {
		return area;
	}
	
	public void displayGarden() {
		System.out.println(garden.getNoOfTree());
	}
	

}
