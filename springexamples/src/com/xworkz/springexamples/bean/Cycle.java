package com.xworkz.springexamples.bean;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	public Cycle() {
		System.out.println("cycle construct found");
		
	}

	public void ridding() {
		System.out.println("ridding");
	}
}


