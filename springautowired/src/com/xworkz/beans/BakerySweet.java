package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BakerySweet {
	
	@Autowired
	private String sweetName;
	@Autowired
	private Integer sweetPrice;

	public Integer getSweetPrice() {
		return sweetPrice;
	}

	public String getSweetName() {
		return sweetName;
	}

}
