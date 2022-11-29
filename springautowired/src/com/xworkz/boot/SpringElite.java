package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Bag;
import com.xworkz.beans.Bakery;
import com.xworkz.beans.BeautyParlour;
import com.xworkz.beans.BusStop;
import com.xworkz.beans.Car;
import com.xworkz.beans.Collage;
import com.xworkz.beans.Gym;
import com.xworkz.beans.Home;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.KantarMovie;
import com.xworkz.beans.Laptop;
import com.xworkz.beans.Mall;
import com.xworkz.beans.Marriage;
import com.xworkz.beans.Mobile;
import com.xworkz.beans.Person;
import com.xworkz.beans.Pg;
import com.xworkz.beans.RailwayStation;
import com.xworkz.beans.Saloon;
import com.xworkz.beans.States;
import com.xworkz.beans.SweetHome;
import com.xworkz.beans.Telegram;
import com.xworkz.beans.Temples;
import com.xworkz.beans.Tv;
import com.xworkz.beans.Vehicle;
import com.xworkz.beans.WhatsApp;
import com.xworkz.configuration.SpringConfig;

public class SpringElite {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); // create and register

		System.out.println(context.getBeanDefinitionCount()); // shows no of objects(beans) created

		String[] beanDefinitionNames = context.getBeanDefinitionNames(); // 20 beans name
		for (String string : beanDefinitionNames) { // string ref to-->beanDefinitionNames,string++
			System.out.println("Created Beans Names: " + string);
		}
		System.out.println("1st Example========================================================================");
		Saloon bean = context.getBean(Saloon.class);
		// bean.getOwnerName();
		// bean.getRent();
		bean.displyTvDetails();
		Tv bean1 = context.getBean(Tv.class);
		bean1.getBrand();
		bean1.getOwnerName();

		System.out.println("2nd example========================================================================");
		Hospital hp = context.getBean(Hospital.class);
		hp.showDoctorDetels();
		System.out.println(hp.getHospitalType());
		System.out.println(hp.getHospitalName());

		System.out.println("3rd examples=======================================================================");
		Pg pg = context.getBean(Pg.class);
		System.out.println(pg.getNoOfPersons());
		System.out.println(pg.getpgOwnerName());
//		Doctor dr= context.getBean(Doctor.class);
//		dr.getName();
//		dr.getSpecialist();

		System.out.println("4th example========================================================================");
		Collage collage = context.getBean(Collage.class);
		System.out.println(collage.getCollageName());
		System.out.println(collage.getArea());
		collage.displayGarden();

		System.out.println("5th examples========================================================================");
		Home home = context.getBean(Home.class);
		System.out.println(home.getNoOfDoors());
		System.out.println(home.getNoOFWindows());
		home.desplyBathroom();

		System.out.println("6th example==========================================================================");
		States states = context.getBean(States.class);
		System.out.println(states.getNameOfTheStates());
		System.out.println(states.getNoOfDistic());
		states.showBengaloreDetailes();
		
		System.out.println("7th example===========================================================================");
		Temples temple = context.getBean(Temples.class);
		System.out.println("place of temple" + temple.getTempleName());
		System.out.println("name of the temple" + temple.getTemplePlace());
		temple.displyTempleAutowired();

		System.out.println("8th example=========================================================================");
		Car car = context.getBean(Car.class);
		System.out.println("Nmae of Car " + car.getNameOfCar());
		System.out.println("Car Doors are " + car.getCarNoOfDoors());
		car.displayStering();
		
		System.out.println("10th example===========================================================================");
		SweetHome home1 = context.getBean(SweetHome.class);
		home1.displayMainDoor();
		System.out.println("Home:number of Windows" + home1.getNoOfwindows());
		System.out.println("Home:number of Rooms Existed" + home1.getNoOfRooms());
		
		System.out.println("11th example=============================================================================");
		Mobile mobile = context.getBean(Mobile.class);
		mobile.displayMobileAutowired();
		System.out.println("Mobile Brand is " + mobile.getMobileBrand());
		System.out.println("Mobile Price is " + mobile.getMobilePrice());
		
		System.out.println("12th example==============================================================================");
		Person person = context.getBean(Person.class);
		person.displayPersonAddress();
		System.out.println("Person Name is " + person.getName());
		System.out.println(person.getName() + " Hieght is " + person.getHieght() + "feet");
		
		System.out.println("13th example=================================================================================");
		WhatsApp wt = context.getBean(WhatsApp.class);
		wt.displayWhatsAppStatus();
		System.out.println("Username Of WhatsApp " + wt.getUserName());
		System.out.println("WhatsApp Contacts " + wt.getNoOfContacts());
		
		System.out.println("14th example=================================================================================");
		Vehicle vi = context.getBean(Vehicle.class);
		vi.displayEngine();
		System.out.println("Bike Name " + vi.getBikeName());
		System.out.println("Bike Company" + vi.getBikeCompany());
		
		System.out.println("15th example===================================================================================");
		Telegram telegram = context.getBean(Telegram.class);
		System.out.println("Telegram Username: " + telegram.getUserName());
		System.out.println("Telegram Password " + telegram.getPassword());
		telegram.displayTelegramAutowired();
		
		System.out.println("16th example===================================================================================");
		Laptop laptop = context.getBean(Laptop.class);
		laptop.displayCharger();
		System.out.println("laptop owner name:" + laptop.getlaptopOwnerName());
		System.out.println("laptop Brand" + laptop.getlaptopBrand());
		
		System.out.println("17th example===================================================================================");
		BeautyParlour beautyParlour = context.getBean(BeautyParlour.class);
		beautyParlour.displayBeautyParlourAutowiredAc();
		System.out.println(beautyParlour.getParlourName());
		System.out.println(beautyParlour.getParloueOwnerName());
		
		System.out.println("18th example====================================================================================");
		KantarMovie ka=context.getBean(KantarMovie.class);
		System.out.println(ka.getHeroName());
		System.out.println(ka.getLanguage());
		ka.displyKantarMovieAutowired();
		
		System.out.println("19 example========================================================================================");
		Bag ba= context.getBean(Bag.class);
		ba.displyBagAutoWired();
		System.out.println(ba.getNoOfPockets());
		
		System.out.println("20 example========================================================================================");
		Bakery bakery = context.getBean(Bakery.class);
		System.out.println(bakery.getBakeryName());
		System.out.println(bakery.getRent());
		bakery.display();

		System.out.println("21 example==========================================================================================");
		Marriage m = context.getBean(Marriage.class);
		System.out.println(m.getMarriagePlace());
		System.out.println(m.getMarriageType());
		m.display();
		
		System.out.println("22 example=========================================================================================");
		BusStop b = context.getBean(BusStop.class);
		System.out.println(b.getBusStopName());
		System.out.println(b.getNoOfbus());
		b.display();
		
		System.out.println("23 example=========================================================================================");
		Mall ml = context.getBean(Mall.class);
		System.out.println(ml.getMallName());
		System.out.println(ml.getNoOfShops());
		ml.dispaly();
		
		System.out.println("24 example==========================================================================================");
		Gym g = context.getBean(Gym.class);
		System.out.println(g.getGymName());
		System.out.println(g.getNoOfGymItems());
		g.display();
		
		System.out.println("25 exmple===========================================================================================");
		RailwayStation r = context.getBean(RailwayStation.class);
		System.out.println(r.getStationName());
		System.out.println(r.getNoOfPlatforms());
		r.display();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
