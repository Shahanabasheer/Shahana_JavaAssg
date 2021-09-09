package Basics;

/**
 * 
 * @author Shahana Basheer 3.Loops in java
 *
 */

import java.util.Scanner;

//Function using for loop
public class Loops {
	public void loopFor() {
		System.out.println("1.For loop+");

		for (int i = 0; i < 10; i++)
			System.out.println("Bright IT Career");
	}

	//Function using while loop
	public void loopWhile() {
		int i = 1;
		System.out.println("\n2.While loop");
		while (i <= 20) {
			System.out.print(" " + i);
			i++;
		}
	}
//Function using equal and not equal operator
	public void equalAndnotequal() {

		System.out.println("\n3.Enter numbers to check equality:");
		/*
		 * Scanner in=new Scanner(System.in); int num1=in.nextInt(); int
		 * num2=in.nextInt();
		 */

		int num1 = 20, num2 = 10;
		if (num1 == num2)
			System.out.println("Numbers are equal");
		if (num1 != num2)
			System.out.println("Numbers are not equal");
	}

	//Function to print odd and even number
	public void oddAndeven() {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("\n4.Odd numbers");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				System.out.print(" " + a[i]);
		}
		System.out.println("Even numbers");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(" " + a[i]);
		}

	}

	//Function to print largest number
	public void largest() {
		int a = 23, b = 15, c = 30;
		System.out.println("\n5.Largest among three numbers");
		if (a >= b && a >= c)
			System.out.println(a + " is the largest number");
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest number");
		else
			System.out.println(c + " is the largest number");
	}

	//Function to print even number between 10 and 100
	public void evenNum() {
		int i = 10;
		System.out.println("\n6.Even number between 10 and 100");
		while (i <= 100) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
	}

	//Function using do while loop
	public void dowhileloop() {
		int i = 1;
		System.out.println("\n7.do while loop");
		do {
			System.out.print(" " + i);
			i++;
		} while (i < 11);

	}

	//Function to check Amstrong number
	public void amstrongnumOrnot() {

		int num, temp, digits = 0, last = 0;
		double sum = 0;
		System.out.println("\n8.Amstrong number or not");
		// System.out.println("Enter the number");
		// Scanner in=new Scanner(System.in);
		// num=in.nextInt();
		num = 153;
		temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			last = temp % 10;
			sum = sum + (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (sum == num) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not amstrong");
		}
	}
//Function to check prime or not
	public void primeOrnot() {
		int num = 20, i, count = 0;
		System.out.println("\n9.Prime or not");

		// System.out.println("Enter the number");
		// Scanner in=new Scanner(System.in);
		// num=in.nextInt();

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("This is a prime number");
		} else {
			System.out.println("This is not a prime number");
		}
	}

	//Function to check palindrome or not
	public void palindromeOrnot() {

		int num, temp, r, rev = 0;
		System.out.println("\n10.Palindrome or not");

		// System.out.println("Enter the number");
		// Scanner in=new Scanner(System.in);
		// num=in.nextInt();

		num = 120;
		temp = num;
		while (num > 0) {
			r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}

	}

	//Function using switch
	public void evenOrodd() {
		int num = 24;
		System.out.println("\n11.Even or odd using switch");

		// System.out.println("Enter the number");
		// Scanner in=new Scanner(System.in);
		// num=in.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + " is even number");
			break;
		case 1:
			System.out.println(num + " is odd number");
			break;
		}

	}

	public void gender() {
		char gender = 'M';
		System.out.println("\n12.Print gender");

		/*
		 * System.out.println("Enter the gender"); Scanner in=new Scanner(System.in);
		 * gender=in.next().charAt(0);
		 */

		switch (gender) {
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("not valid");

		}

	}

	public static void main(String args[]) {
		Loops loop = new Loops();
		loop.loopFor();
		loop.loopWhile();
		loop.equalAndnotequal();
		loop.oddAndeven();
		loop.largest();
		loop.evenNum();
		loop.dowhileloop();
		loop.amstrongnumOrnot();
		loop.primeOrnot();
		loop.palindromeOrnot();
		loop.evenOrodd();
		loop.gender();

	}
}
