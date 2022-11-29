package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KantarMovieAutowired {
	
	@Autowired
	private String heroenName;
	@Autowired
	private String heroenOriginalName;
	
	
	public String getHeroenName() {
		return heroenName;
	}
	public String getHeroenOriginalName() {
		return heroenOriginalName;
	}

	
}
