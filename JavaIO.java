package Basics;


/**
 * 
 * @author Shahana Basheer 15.Java IO
 *
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaIO {

	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("F:\\SHAHAANDATAS/Testtextin.txt");
			FileOutputStream fout=new FileOutputStream("F:\\SHAHAANDATAS/Testtextout.txt");
			
		
			System.out.println("FileInputSream....");
			int i; 
			
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            } 
            
            fout.write(65);
           
            fin.close();
			fout.close();
			
			System.out.println("success...");    
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
