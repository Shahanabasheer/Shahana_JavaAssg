package Basics;

/**
 * 
 * @author Shahana Basheer 14.Exceptions in java
 *
 */

public class ExceptionsJava {
	
	public void divbyZero() throws ArithmeticException {
		int p=10,q=0,d=0;
		d=p/q;
		System.out.println("Value of d is "+d);
	}
	
	public static void pass(int mark) {
		if(mark<18) {
			throw new ArithmeticException("Student is not passed");
		}
		else {
			System.out.println("Student is passed");
		}
	}
	
	public static void main(String[] args) {
	      int a = 0, b = 10;
	      int c=0;
	      int ar[]=new int[5];
	      
	      ExceptionsJava ej=new ExceptionsJava();
	     // ej.divbyZero();
	      
	      /*
	      int c = b/a;
	      System.out.println("Value of c is : "+ c);
	      */
	      
	      try {
	    	  //ej.divbyZero();
	          c = b/a;
	          ar[5]=30/0;
	          
	          System.out.println("Array.."+ar[6]);
	       } 
	      
	      catch (ArithmeticException e) {
	    	   System.out.println("Arithmetic Exception occurs "+e);  
	      }
	      catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);  
          } 
	      catch(Exception e)  
          {  
           System.out.println("Parent Exception occurs "+e);  
          }   
	      finally {  
	    	  System.out.println("finally block is always executed");  
	    	  }    
	      System.out.println("Value of c is : "+ c);
	      
	      pass(15);
	      
	   }
}
