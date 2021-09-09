package Basics;

/**
 * 
 * @author Shahana Basheer 11.This and super in java
 *
 */

class subClass extends ThisSuper{

	//int a=100,b=200;
	subClass(int a, int b) {
		super(a, b);//Call parent class constructor
		System.out.println("Child class constructor");
		
	}
	
	void Display() {
		System.out.println("A and B from child class : "+a+" "+b);
	}
	void show() {
	super.Display();
	}
	
}
class ThisSuper
{
    int a;
    int b;
     
   ThisSuper(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Parent class constructor");
    }
 
    void Display()
    {
       System.out.println("A and B from parent class : "+a+" "+b);
    }
 
    void Printv() {
    	this.Display();
    	System.out.println("This Super class..");
    }
    public static void main(String[] args)
    {
    	ThisSuper object = new ThisSuper(10, 20);
        object.Display();
        
        subClass sc=new subClass(100, 200);
        sc.Display();
        
        sc.show();
        
        object.Printv();
        
    }
}