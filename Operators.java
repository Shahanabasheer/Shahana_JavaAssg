package Basics;
/**
 * 
 * @author Shahana Basheer 2.Basic Operators in java
 *
 */
public class Operators {
	// 1.Function Arithmetic operations
	public void arithmeticOperators() {
		int a = 10, b = 2;
		System.out.println("Arithmetic operations");
		System.out.println("Addition " + (a + b));
		System.out.println("Subtraction " + (a - b));
		System.out.println("Multiplication " + a * b);
		System.out.println("Division " + a / b);
	}

	// 2.Function Increment and decrement operations
	public void incrementDecrement() {
		int i = 1, j = 10;
		System.out.println("\nIncrement and decrement operations");
		System.out.println("Increment " + (i++));
		System.out.println("decrement " + (j--));
	}

	// 3.Function equal or not
	public void equalNotequal() {
		int a = 10, b = 20, c = 10;
		System.out.println("\nEqual and Not equal operations");
		if (a == b)
			System.out.println(a + "Equal " + b);
		else
			System.out.println(a + " Not equal " + b);
		if (a == c)
			System.out.println(a + " Equal " + c);
		else
			System.out.println(a + " Not equal " + c);

	}

	// 4.Function numbers equal or not
	public void numEqual() {
		int a = 10, b = 20;
		System.out.println("\nNumbers equal or not");
		if (a == b)
			System.out.println("Numbers are equal");
		else
			System.out.println("Numbers are not equal");
	}

	// 5.Function logical operations
	public void logicalOperators() {
		int a = 10, b = 20, c = 30;
		System.out.println("\nLogical operations");

		if (a < b && a < c)
			System.out.println("Both conditions are true");
		else
			System.out.println("False condition");
		if (b < a || c < b)
			System.out.println("One or both conditions are true");
		else
			System.out.println("Both conditions are false");
		System.out.println("Not a<b " + !(a < b));
	}

	// 6.Function relational operations
	public void relationalOperations() {
		int a = 10, b = 20;

		System.out.println("\nRelational operations");
		System.out.println("Equal to " + (a == b));
		System.out.println("Not equal to " + (a != b));
		System.out.println("Greater than " + (a > b));
		System.out.println("Less than " + (a < b));
		System.out.println("Greter than or equal to " + (a >= b));
		System.out.println("Less than  or equal to " + (a <= b));

	}

	// 7.Smaller and larger number
	public void smallerAndlarger() {
		int a = 10, b = 20;
		System.out.println("\nSmaller and Larger");
		if (a > b)
			System.out.println("Larger number is " + a + " Smaller number is " + b);
		else
			System.out.println("Larger number is " + b + " Smaller number is " + a);

	}

	// Main method
	public static void main(String args[]) {
		Operators op = new Operators();
		op.arithmeticOperators();
		op.incrementDecrement();
		op.equalNotequal();
		op.numEqual();
		op.logicalOperators();
		op.relationalOperations();
		op.smallerAndlarger();
	}

}
