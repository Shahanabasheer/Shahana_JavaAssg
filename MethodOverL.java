package Basics;

/**
 * 
 * @author Shahana Basheer 13.Method over loading in java
 *
 */

class OverLoading{
	public void add(int a,int b) {
		int s=0;
		s=a+b;
		System.out.println("Sum of two numbers: "+s);
	}
	public void add(int a,int b,int c) {
		int s=0;
		s=a+b+c;
		System.out.println("Sum of three numbers: "+s);
	}
	
	public void add(double a,double b,double c) {
		double s;
		s=a+b+c;
		System.out.println("Sum of three double numbers :"+s);
				
	}
	
	public int mul(int a,int b) {
		int m;
		m=a*b;
		return m;
	}

	public double mul(int a,int b) {
		int m;
		m=a*b;
		return m;
	}
}

public class MethodOverL {
	
	public static void main(String args[]) {
		MethodOverL mOver=new MethodOverL();
		
		OverLoading ol=new OverLoading();
		ol.add(20, 30);
		ol.add(50, 60, 80);
		ol.add(25.5, 15.5, 20.5);
		
		System.out.println("Same name same number of parameters of same type ");
		ol.add(40, 60);
		ol.add(100, 200);
		
		System.out.println("Different return value");
		ol.mul(3, 6);
		ol.mul(300,400);
	}
}
