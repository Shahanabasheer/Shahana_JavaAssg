package newpack;

/**
 * 
 * @author Shahana Basheer 8.Access modifiers in java
 *
 */

import Basics.PubModifiers;

public class TestPub {

public static void main(String args[]) {
		
	PubModifiers testp=new PubModifiers();
		
		System.out.println("Display public field and method from a class located in a different package: "+testp.a);
		testp.displaypublicA();
	}
}
