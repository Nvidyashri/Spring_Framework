package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SweetHome {
	
	@Autowired
	private int noOfRooms;
	@Autowired
	private int noOfwindows;
	@Autowired
	private HomeProperty property;

	public SweetHome() {
		System.out.println("Default contructor");
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public int getNoOfwindows() {
		return noOfwindows;
	}

	public void displayMainDoor() {
		System.out.println("Home:Is Kitchen Available "+property.isKitchen());
		System.out.println("Home:Is Main Door Exist  "+property.isMainDoor());
	}

}
