package com.d14.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import com.d14.constants.StaticVariables;

public class Utils {
	
	private Scanner sc;
	public boolean close()
	{
		return true;
	}
	public String readFile(String path)
	{
		
		File file=new File(path);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		String filecontant="";
		while(sc.hasNextLine())
		{
			filecontant=filecontant.concat(sc.nextLine()+ "\n");
		}
		
		return filecontant;

		
	}
	
	public String upperCase(String val)
	{
		return val.toUpperCase();
	}
	
	public String lowerCase(String val)
	{
		return val.toLowerCase();
	}
	
	public String replace(String val, String repVal)
	{
		return val.replaceAll(repVal, "s*****");
	}
	
	public String removeDuplicateWord(String val)
	{
		return val.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
	}
	
	public void replaceStringValue(String val)
	{
		StaticVariables.STRINGWRITER = val;
	}
	
	public void writeFile(String content) {
		 try{    
			 if(!StaticVariables.FILEWRITERLOSE) {
			   File file = new File(StaticVariables.PATH); 
   			   boolean  result = file.createNewFile();  
			   if(result)     
			   {  
			   System.out.println("file created "+file.getCanonicalPath()); 
			   }  
			   FileWriter fw=new FileWriter(file); 
			   fw.write(content);
	           fw.close();    
	          }
		 }
			 catch(Exception e){
				 System.out.println(e);
				 }   
	}

}
