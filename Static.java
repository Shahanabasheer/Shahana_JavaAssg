package Basics;

/**
 * 
 * @author Shahana Basheer 5.Static in java
 *
 */

public class Static {

	static int svar1 = 15;
	static int svar2 = 25;
	int ivar1 = 10;
	int ivar2 = 20;

	static void printInstancevar() {
		Static s1 = new Static();
		System.out.println("Instsnce variables are " + s1.ivar1 + " and " + s1.ivar2);
		s1.addStaticvar();
	}

	static void addInstancevar() {
		Static s2 = new Static();
		int isum = 0;
		isum = s2.ivar1 + s2.ivar2;
		System.out.println("Sum of instance variables from static method " + isum);
	}

	public void printStaticvar() {
		System.out.println("Static variables are " + svar1 + " and " + svar2);
		addInstancevar();
	}

	public void addStaticvar() {
		int ssum = 0;
		ssum = svar1 + svar2;
		System.out.println("Sum of static variables from instance method " + ssum);
	}

	public static void main(String args[]) {
		Static s = new Static();

		printInstancevar();
		s.printStaticvar();

		System.out.println("From main Static variables: " + svar1 + " " + svar2);
		System.out.println("From main Instance variables: " + s.ivar1 + " " + s.ivar2);

		System.out.println("From main method ");
		addInstancevar();
		s.addStaticvar();

	}
}
