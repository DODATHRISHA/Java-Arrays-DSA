package com.oops.inheritence;

class Vehicle {
	String vehicleName;
	int vehicleNumber;
	int rentPerDay;

	void calculateRent(int days) {
		int a = rentPerDay * days;
		System.out.println("total days:"+a);
	}
		
}

class Car extends Vehicle {
	@Override
	void calculateRent(int days) {
		int a = rentPerDay * days;
		int total = a * 10 / 100;
		int bill = total+a;
		System.out.println("total rent:"+bill);

	}
}

class Bike extends Vehicle {
	@Override
	 void calculateRent(int days) {
		    int a1 = rentPerDay * days;
			int total = a1 * 5 / 100;
			int bill1 = total+a1;
			System.out.println("total rent:"+bill1);
	 }
}

class Bus extends Vehicle {
	@Override
	 void calculateRent(int days) {
		    int a2 = rentPerDay * days;
			int total = a2 * 15 / 100;
			int bill2 = total+a2;
			System.out.println("total rent:"+bill2);
	 }
}
public class VehicleRentalSystem {

	public static void main(String[] args) {
		Car c = new Car();
		c.vehicleName = "tata";
		c.rentPerDay = 100;
		c.vehicleNumber = 1234;
		c.calculateRent(5);  
		
		System.out.println("vehicle Name:" + c.vehicleName);
		System.out.println("vehicle Number:" + c.vehicleNumber);
		System.out.println("rentPer Day:" + c.rentPerDay);
		
		Bike b = new Bike();
		b.vehicleName="pulsar";
		b.rentPerDay=100;
		b.vehicleNumber=8768;
		b.calculateRent(2);
		
		System.out.println("***************************");
		System.out.println("vehicle Name:" + b.vehicleName);
		System.out.println("vehicle Number:" + b.vehicleNumber);
		System.out.println("rentPer Day:" + b.rentPerDay);
		
		 Bus s = new  Bus();
		s.vehicleName="Volvo Bus";
		s.rentPerDay=100;
		s.vehicleNumber=8768;
		s.calculateRent(8);
		
		System.out.println("***************************");
		System.out.println("vehicle Name:" + s.vehicleName);
		System.out.println("vehicle Number:" + s.vehicleNumber);
		System.out.println("rentPer Day:" + s.rentPerDay);
	}

}

