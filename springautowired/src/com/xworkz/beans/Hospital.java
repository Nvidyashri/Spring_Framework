package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	@Autowired
	private String hospitalName;
	@Autowired
	private String hospitalType;
	
	@Autowired
	private Doctor doctor;
	
	public String getHospitalName() {
		return hospitalName;
	}
	public String getHospitalType() {
		return hospitalType;
	}
	public void showDoctorDetels() {
		System.out.println(doctor.getName());
		System.out.println(doctor.getSpecialist());
	}
	
	

}
