package Basics;

/**
 * 
 * @author Shahana Basheer 7.Inheritance  in java
 *
 */

class A {

	int a = 5, b = 10;

	void printA() {
		System.out.println("Class A super class");
	}

	void setValueA() {

		System.out.println("Values in class A " + a + " and " + b);
	}

	void sum() {
		System.out.println("Sum of values in class A " + (a + b));
	}
}

class B extends A {
	int a = 20, b = 30;

	void printB() {
		System.out.println("Class B sub class of A ");
	}

	void setValueB() {

		System.out.println("Values in class B " + a + " and " + b);
	}

	void sum() {
		System.out.println("Sum of values in class B " + (a + b));
		super.sum();
	}

}

class C extends B {
	int a = 25, b = 35;

	void printC() {
		System.out.println("Class C sub class of B");
	}

	void setValueC() {

		System.out.println("Values in class C " + a + " and " + b);
	}

	void sum() {
		System.out.println("Sum of values in class C " + (a + b));
		super.sum();
	}
}

public class Inheritance {

	public static void main(String args[]) {

		// Creating objects
		A a = new A();
		B b = new B();
		C c = new C();

		a.printA();
		a.setValueA();
		a.sum();

		b.printB();
		b.setValueB();
		b.sum();

		c.printC();
		c.setValueC();
		c.sum();

		A ab = new B();
		A ac = new C();

		System.out.println("Run time polymorphism");

		ab.sum();
		ac.sum();

	}

}
