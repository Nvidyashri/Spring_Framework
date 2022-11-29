package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.BusStop;

@Configuration // META INFO(connection betn external system to java
@ComponentScan("com.xworkz") // search components
public class SpringConfig {

	@Bean // register to spring
	public String ownerName() {
		return "Vidyashri";
	}

	@Bean
	public String brand() {
		return "samsung";
	}

	@Bean
	public double rent() {
		return 2000.00;
	}

	@Bean
	public String hospitalName() {
		return "Jayadeva";
	}

	@Bean
	public String hospitalType() {
		return "Cardiovascular";
	}

	@Bean
	public String name() {
		return "Dr Anand P Subramanian";
	}

	@Bean
	public String specialist() {
		return " Cardiologists";
	}

	@Bean
	public String pgOwnerName() {
		return "basavaraj";
	}
//colege beans
	@Bean
	public int noOfPersons() {
		return 70;
	}

	@Bean
	public String collageName() {
		return "SKSVMACET";
	}

	@Bean
	public String area() {
		return "laxmeshwar";
	}

	@Bean
	public double noOfTree() {
		return 200.00;
	}

	@Bean
	public double noOfDoors() {
		return 5.00;
	}

	@Bean
	public double noOFWindows() {
		return 6.00;
	}

	@Bean
	public double noOfBukets() {
		return 2.00;

	}

	@Bean
	public double noOfMirror() {
		return 1.00;
	}

	// bengalore beans
	@Bean
	public String nameOfTheStates() {
		return "Karnataka";
	}

	@Bean
	public double noOfDistic() {
		return 30.00;

	}

	@Bean
	public String originalName() {
		return "Bendkaluru";
	}

	@Bean
	public String bengaloreIs() {
		return "Capital of KArnataka";
	}

	@Bean
	public String templePlace() {
		return "BTM layout";
	}

	@Bean
	public String templeName() {
		return "venkateshwara temple";
	}

	@Bean
	public boolean donationCounter() {
		return true;
	}

	@Bean
	public String godName() {
		return "Krishna ";
	}

	@Bean
	public String nameOfCar() {
		return "Tata Nexon";
	}

	@Bean
	public int carNoOfDoors() {
		return 4;
	}

	@Bean
	public String type() {
		return "Hyadraulic stear";
	}

	@Bean
	public int buttons() {
		return 4;
	}
	@Bean
	public int noOfwindows() {
		return 5;
	}

	@Bean
	public int noOfRooms() {
		return 6;
	}

	@Bean
	public boolean kitchen() {
		return true;
	}

	@Bean
	public boolean mainDoor() {
		return true;
	}
	@Bean
	public String mobileBrand() {
		return "APPLE";
	}

	@Bean
	public double mobilePrice() {
		return 60000.00;
	}

	@Bean
	public boolean ram() {
		return true;
	}

	@Bean
	public boolean secMemory() {
		return true;
	}

	@Bean
	public boolean processor() {

		return true;
	}
	@Bean
	public String statusPerson() {
		return "Bot";
	}

	@Bean
	public int noOfContacts() {
		return 365;
	}

	@Bean
	public int noOfStatus() {
		return 300;
	}

	@Bean
	public String userName() {
		return "Prashant";
	}
	@Bean
	public String statusPerson1() {
		return "Bot";
	}

	@Bean
	public int noOfContacts1() {
		return 365;
	}

	@Bean
	public int noOfStatus1() {
		return 300;
	}

	@Bean
	public String userName1() {
		return "Vishal";
	}
	@Bean
	public String bikeName() {
		return "Unicorn";
	}

	@Bean
	public String bikeCompany() {
		return "Hero MotoCorp";
	}

	@Bean
	public String engineName() {
		return "Twin A";
	}

	@Bean
	public String engineType() {
		return "Combussion Engine";
	}
	@Bean
	public String telgramUserName() {
		return "Tharun ";
	}

	@Bean
	public String password() {
		return "@Tharun123";
	}

	@Bean
	public Integer noOfGroups() {
		return 12;
	}

	@Bean
	public Integer noOfContacts11() {
		return 150;
	}
	@Bean
	public String laptopOwnerName() {
		return "Hawlett Packard";
	}

	@Bean
	public String laptopBrand() {
		return "Hp";
	}

	@Bean
	public String hpBrand() {
		return "Hp Compny charger";
	}

	@Bean
	public String capacity() {
		return "65W";
	}
	@Bean
	public String parlourName() {
		return "Laka Laka Parlour";
	}

	@Bean
	public String parloueOwnerName() {
		return "Rashmika";
	}

	@Bean
	public String acBrandName() {
		return "Butterfly";
	}

	@Bean
	public String acProdPlace() {
		return "Bengalore";
	}
	@Bean
	public String language() {
		return "KANNADA";
	}
	@Bean
	public String heroName() {
		return "Rishab Shetti";
		
	}
	@Bean
	public String heroenName() {
		return "lila";
				
	}
	@Bean
	public String heroenOriginalName() {
		return "saptami gouda";
		
	}
	@Bean
	public int noOfPockets() {
		return 6;
	}
	@Bean
	public int noOfPencils() {
		return 2;
		
	}
	@Bean 
	public int noOfPens() {
		return 5;
	}
	@Bean
	public String bakeryName() {
		return "IyengarBakery";
	}

	@Bean
	public double rent1() {
		return 8000.00;
	}

	@Bean
	public String sweetName() {
		return "DharwadPedha";
	}

	@Bean
	public Integer sweetPrice() {
		return 80;
	}
	@Bean
	public String marriageType() {
		return "lovemarriage";
	}

	@Bean
	public String marriagePlace() {
		return "hubli";
	}

	@Bean
	public String groomName() {
		return "rekha";

	}

	@Bean
	public int groomAge() {
		return 28;
	}
	@Bean
	public BusStop busStop() {
		BusStop bus = new BusStop();
		return bus;
	}

	@Bean
	// @Primary
	public String busStopName() {
		return "Mejestic";
	}

	@Bean
	public int noOfbus() {
		return 1500;
	}

	@Bean
	// @Primary
	public String busNo() {
		return "KA01RA2765";
	}
	@Bean
	public String mallName() {
		return "lulu mall";
	}

	@Bean
	public int noOfShops() {
		return 110;
	}

	@Bean
	public String mallOwnerName() {
		return "DK shivakumar";
	}

	@Bean
	public int ownerAge() {
		return 58;

}

	@Bean
	public String stationName() {
		return "SRS hubli";
	}

	@Bean
	public int noOfPlatforms() {
		return 10;
	}

	@Bean
	public String trainName() {
		return "Hampi express";
	}

	@Bean
	public int trainCapacity() {
		return 2500;
	}

}
