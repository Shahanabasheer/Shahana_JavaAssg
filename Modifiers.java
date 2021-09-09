package Basics;

/**
 * 
 * @author Shahana Basheer 8.Access modifiers in java
 *
 */

class SubModifires extends Modifiers {

	void displayA() {
		System.out.println("Value of A from subclass " + getA());
	}
}

public class Modifiers {

	private int a = 10, b = 20;

	private void printA() {
		System.out.println("Print value of A and B : " + a + " " + b);
	}

	public static void main(String args[]) {

		Modifiers mod = new Modifiers();
		SubModifires submod = new SubModifires();

		System.out.println("Values of A nad B in main " + mod.a + " " + mod.b);
		mod.printA();

		DModifiers dm = new DModifiers();
		dm.displayA();
		System.out.println("Value of A in Default Modifiers: " + (dm.a + 10));

		submod.displayA();

		System.out.println("Display value from protected modifiers");
		ProtModifiers pm = new ProtModifiers();
		pm.displayApro();
		
		System.out.println("Display value from public modifiers");
		PubModifiers pubmod=new PubModifiers();
		pubmod.displaypublicA();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
