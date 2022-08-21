package com.d14.interfaces.impl;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.d14.constants.StaticVariables;
import com.d14.interfaces.WriteInfo;

public class FileWritter implements WriteInfo {
	
	private Scanner sc;

	@Override
	public void Write() {
		 try{    
			 if(!StaticVariables.FILEWRITERLOSE) {
			   File file = new File(StaticVariables.PATH); 
   			   boolean  result = file.createNewFile();  
			   if(result)  
			   {  
			   System.out.println("file created "+file.getCanonicalPath()); 
			   }  
			   FileWriter fw=new FileWriter(file,true); 
			   sc = new Scanner(System.in);
	   		   System.out.println("Enter the file value ::");
	   		   fw.write(sc.nextLine()+" ");    
	           fw.close();    
	          }
		 }
			 catch(Exception e){
				 System.out.println(e);
				 }    
	             
	      
		
		
	}
	
	}
	
	
	


