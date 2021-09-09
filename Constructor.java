package Basics;

/**
 * 
 * @author Shahana Basheer 12.Constructors in java
 *
 */
//Private constructor
class PrConstructor{
	private String name;
	private int num;
	  
	private PrConstructor(){
	      this.name = "Raju";
	      this.num = 20;
	}
	 
	public static PrConstructor getInstance() {
		PrConstructor object = new PrConstructor();
	    return object;
	}
	
	public void display(){
	    System.out.println("Name : "+this.name );
	    System.out.println("Number "+this.num );
	}
}
class childConstructor extends Constructor{
	
	childConstructor(){
		super();
		System.out.println("Default constructor Child is created..");
	}
	childConstructor(int a){
		A=a;
	}
	childConstructor(int a,int b){
		A=a;
		B=b;
	}
	
}
public class Constructor {

	int A,B,C;
	
	Constructor(){
		System.out.println("Default constructor Parent is created..");
	}
	
	Constructor(int a){
		A=a;
	}
	
	Constructor(int a,int b){
		A=a;
		B=b;
	}
	 
	private Constructor(int a,int b,int c){
		System.out.println("Default constructor PRIVATE is created..");
	}
	public Constructor(int a,int b,int c,int d){
		System.out.println("Default constructor PUBLIC is created..");
	}
	
	void Display() {
		System.out.println("A and B :"+A+" "+B);
	}
	public static void main(String args[]) {
		
		Constructor con1=new Constructor();
		Constructor con2=new Constructor(10);
		Constructor con3=new Constructor(50,60);
		Constructor con4=new Constructor(50,60,70);
		Constructor con5=new Constructor(50,60,70,80);
		
		childConstructor ccon1=new childConstructor();
		childConstructor ccon2=new childConstructor(100);
		childConstructor ccon3=new childConstructor(100,200);
		
		PrConstructor object =PrConstructor.getInstance();
		object.display();
	}
}