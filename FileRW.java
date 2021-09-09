package Basics;

import java.io.FileReader;
import java.io.FileWriter;

public class FileRW {
	public static void main(String args[]){    
        try{ 
        	
        	FileReader fr=new FileReader("F:\\SHAHAANDATAS/Testtextin.txt"); 
        	FileWriter fw=new FileWriter("F:\\SHAHAANDATAS/Testtextout.txt");  
        	
        	int i; 
			while((i=fr.read())!=-1){    
             System.out.print((char)i);    
            } 
          
          fw.write("Welcome to Java File writer");    
          
          fw.close(); 
          fr.close();
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    
}
