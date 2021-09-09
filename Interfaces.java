package Basics;

/**
 * 
 * @author Shahana Basheer 10.Interface in java
 *
 */

interface Vehicle{
	
	public void runCar();
	public void speed();
}
interface Bike{
	
	public void rideBike();
	public void stopBike();
	public void speed();
}

interface Bus{
	
	default void start() {
		System.out.println("Bus started...");
	}
}

interface Scooter extends Vehicle{
	
	public void fuel();
}


public class Interfaces implements Vehicle,Bike,Bus {

	
	public void runCar() {
		System.out.println("Car running safely....");
	}
	
	public void speed() {
		System.out.println("Speed limit 50km/h");
	}
	
	public void rideBike() {
			System.out.println("Bike rinding...");	
	}

	
	public void stopBike() {
		System.out.println("Stop bike...");
		
	}
	
	public void fuel() {
		
	}
	
	public static void main(String args[]) {
		 Interfaces inter=new Interfaces();
		 
		 System.out.println("Call implemented method..");
		 inter.runCar();
		 
		 System.out.println("A class tha implements an interface must implement all the methods declared in the interface ");
		 inter.rideBike();
		 
		 inter.speed();
		 
		 Vehicle veh=(Vehicle) inter;
		 veh.speed();
		 
		 System.out.println("Interface with default method..");
		 inter.start();
		 
		 inter.fuel();
	}

	
	
	

}
