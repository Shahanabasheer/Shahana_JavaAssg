package Basics;
/**
 * 
 * @author Shahana Basheer 8.Access modifiers in java
 *class with public fields
 */


public class PubModifiers {

	public int a = 300;

	public void displaypublicA() {

		System.out.println("Display value of A in Public Modifiers: " + a);
	}

	public static void main(String args[]) {
		System.out.println("From class PubModifiers..");
		// DModifiers dm=new DModifiers();
		// dm.displayA();

	}
}
