package newpack;

/**
 * 
 * @author Shahana Basheer 8.Access modifiers in java
 *
 */

import Basics.ProtModifiers;

public class TestProtChild extends ProtModifiers{

	public static void main(String args[]) {
		
		TestProtChild test=new TestProtChild();
		
		System.out.println("Display protected field and method from child class located in a different package: "+test.a);
		test.displayApro();
	}
}
