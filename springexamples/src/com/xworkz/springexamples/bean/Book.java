package com.xworkz.springexamples.bean;

import org.springframework.stereotype.Component;

@Component
public class Book {
	public Book() {
		System.out.println("created book");
	}

}
