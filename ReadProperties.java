package Basics;

/**
 * 
 * @author Shahana Basheer 15.Java IO
 *
 */

import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("FileProperties.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
}
