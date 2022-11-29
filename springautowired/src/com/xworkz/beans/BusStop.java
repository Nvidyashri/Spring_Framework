package com.xworkz.beans;


import org.springframework.beans.factory.annotation.Autowired;

public class BusStop {
	
	@Autowired
	String busStopName;
	@Autowired
	private int noOfbus;
	@Autowired
	private Bus bus;

	public BusStop() {
		System.out.println("created bus stop constructor......");
	}

	public String getBusStopName() {
		return busStopName;
	}

	public int getNoOfbus() {
		return noOfbus;
	}

	public void display() {
		System.out.println("solving");
		System.out.println(bus.getPrice());
		System.out.println(bus.getBusNo());
	}

}
