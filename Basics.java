package Basics;

/**
 * 
 * @author Shahana BAsheer 1.Java Basics
 *
 */
public class Basics {

	static int global = 10;

	// This is a comment
	public void printWelcome(String lang) {
		System.out.println("Welcome to " + lang);
	}

	/*
	 * This is a function to print name
	 */
	public void printName(String name) {
		System.out.println("My name is " + name);
	}

	//Function to print different data types
	public void dataTypes() {
		char c = 'A';
		boolean b = true;
		int i = 68;
		float f = 34.8654f;
		double d = 34.8645;

		System.out.println("Data types");
		System.out.println(c);
		System.out.println(b);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
	}
// Local and global variables defining function
	public void variable() {
		int global = 20;
		System.out.println("Variable local " + global);
	}

	public static void main(String args[]) {

		Basics basic = new Basics();
		basic.printWelcome("Java");
		basic.printName("Shahana Basheer");
		basic.dataTypes();
		System.out.println("Variable global " + global);
		basic.variable();
	}

}
