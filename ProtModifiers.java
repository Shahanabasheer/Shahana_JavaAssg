package Basics;
/**
 * 
 * @author Shahana Basheer 8.Access modifiers in java
 *class with protected fields
 */


public class ProtModifiers extends Modifiers {

	protected int a = 200;

	protected void displayApro() {

		System.out.println("Display value of A " + a);
	}

	public static void main(String args[]) {
		System.out.println("Protected class");

	}

}
