package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pg {
	@Autowired
	private int noOfPersons;
	@Autowired
	private String pgOwnerName;
	@Autowired
	private Canteen canteen;

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public String getpgOwnerName() {
		return pgOwnerName;
	}

	public void displayCanteen() {
		System.out.println(canteen.getChefSalary());
		System.out.println(canteen.getNoOfChefs());
	}
}
