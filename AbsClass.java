package Basics;
/**
 * 
 * @author Shahana Basheer 9.Abstract class
 *
 */

	abstract class Car{
	
		abstract void run();
		void gearChange() {
		 System.out.println("Gear chaged...");
		}
	
	}

public class AbsClass extends Car {
	
	void run() {
		System.out.println("Car running safely");
	}

	public static void main(String args[]) {
		Car obj=new AbsClass();
		
		AbsClass abs=new AbsClass();
		
		System.out.println("From abstract class..");
		obj.run();
		obj.gearChange();
		
		System.out.println("From child class...");
		abs.run();
		abs.gearChange();
	}
}
