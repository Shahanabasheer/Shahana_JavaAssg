package Basics;

/**
 * 
 * @author Shahana Basheer 8.Access modifiers in java
 *class with default fields
 */

public class DModifiers {

	int a = 100;

	void displayA() {

		System.out.println("Display value of A in Default Modifiers: " + a);
	}

	public static void main(String args[]) {
		System.out.println("From class DModifiers..");
		// DModifiers dm=new DModifiers();
		// dm.displayA();

	}
}
