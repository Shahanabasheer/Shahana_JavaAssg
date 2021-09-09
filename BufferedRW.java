package Basics;

/**
 * 
 * @author Shahana Basheer 15.Java IO
 *
 */

import java.io.*;

public class BufferedRW {
	public static void main(String args[])throws Exception{  
		
        FileReader fr=new FileReader("F:\\SHAHAANDATAS/Testtextin.txt"); 
        FileWriter fw = new FileWriter("F:\\SHAHAANDATAS/Testtextout.txt");  
        
        BufferedReader br=new BufferedReader(fr);    
        BufferedWriter bw = new BufferedWriter(fw);  
        
        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        
        bw.write("Welcome to java Buffered reader writer");  
        
        bw.close();  
        br.close();    
        fr.close(); 
        fw.close();
  }    
}
