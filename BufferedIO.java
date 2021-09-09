package Basics;

/**
 * 
 * @author Shahana Basheer 15.Java IO
 *
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedIO {
	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("F:\\SHAHAANDATAS/Testtextin.txt");
			FileOutputStream fout=new FileOutputStream("F:\\SHAHAANDATAS/Testtextout.txt");
			
			BufferedInputStream bin=new BufferedInputStream(fin);
			BufferedOutputStream bout=new BufferedOutputStream(fout);    
			
			System.out.println("\nBufferedInputStream...");
            
            while((bin.available()>0)){    
             System.out.print((char)bin.read());    
            }    
            
            String s="\nWelcome to java Buffered output stream";    
            byte b[]=s.getBytes();    
            bout.write(b);    
            bout.flush(); 
            
            bin.close(); 
            bout.close();
            
            fin.close();
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
}
