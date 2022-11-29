package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bag {
	
	@Autowired
	private int noOfPockets;
	
	@Autowired
	private BagAutoWired bag;

	public int getNoOfPockets() {
		return noOfPockets;
	}

	public BagAutoWired getBag() {
		return bag;
	}
	public void displyBagAutoWired() {
		System.out.println(bag.getNoOfPencils());
		System.out.println(bag.getNoOfPens());
		
	}

}
