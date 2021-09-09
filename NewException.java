package Basics;

/**
 * 
 * @author Shahana Basheer  14.Exceptions  in java
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class EXceptions{
	static String str="No such method";
	/*
	public static String getString() {
		return str;
	}*/
}
public class NewException {
	public void arithmeticX() {
		try {
			int a = 0, b = 10;
			int c = b/a;
			System.out.println("Value of c is : "+ c);
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic exception "+ex);
		}
		
	}
	
	public void arrayOutofbound() {
		try {
			int ar[]= {1,2,3,4,5};
			for(int i=0;i<=ar.length;i++)
				System.out.println(ar[i]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array outofbound exception "+ex);
		}
	}

	public void classNotfound() {
		try {
		 Class.forName("javamain");
		}catch(ClassNotFoundException ex) {
			System.out.println("Class not found exception "+ex);
		}
	}
	
	public void fileNotfound() {
		try {
			File file = new File("myFile");
		    FileInputStream fis = new FileInputStream(file);
		    System.out.println("Hello");
		}catch(FileNotFoundException ex) {
			System.out.println("File not found exception "+ex);
		}
	}
	public void nullPointer() {
		Object ab=null;
		ab.toString();
	}
	
	public void numberFormat() {
		int i;
		i=Integer.parseInt("12,0");
	}
	
	public void stringIndexoutofbound() {
		String str="Welcome";
		System.out.println("String length "+str.length());
		System.out.println("Substring "+str.substring(10));
		
	}
	
	
	public static void main(String[] args) {
		NewException nx=new NewException();
	    
		//nx.arithmeticX();
		
		//nx.arrayOutofbound();
		
		//nx.classNotfound();
		
		//nx.fileNotfound();
		
		//nx.nullPointer();
		
		EXceptions ex=new EXceptions();
		System.out.println("No such method Exception");
		//ex.getString();
		
		//nx.numberFormat();
		
		nx.stringIndexoutofbound();
	   }


	
	
}
