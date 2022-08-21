package com.d14;

import java.awt.image.WritableRenderedImage;
import java.util.Scanner;

import com.d14.constants.StaticVariables;
import com.d14.interfaces.WriteInfo;
import com.d14.interfaces.impl.FileWritter;
import com.d14.interfaces.impl.StringWriter;
import com.d14.interfaces.impl.WriterDecorator;
import com.d14.utils.Utils;

public class FileReadWrite {

	private static Scanner stringscanner;
	private static Scanner filescannse;
	private static Scanner sc;

	public static void main(String[] args) {
		 
		WriteInfo stringWriter= new WriterDecorator( new StringWriter());
		WriteInfo  fileWriter=new WriterDecorator(new FileWritter());
		Utils utils=new Utils();
		
	do {	
System.out.println("Please Select Option ");
System.out.println("");
System.out.println("1. String Writer ");
System.out.println("2. File Writer \n");

sc = new Scanner(System.in);
switch(Integer.parseInt(sc.next())) //Switch expression
{
   
   case 1:
	   boolean innerswitch=false;
   do {
	  
	   System.out.println(" ");
	   System.out.println(" Please select below options ");
	   System.out.println("1. Enter Data for string ");
	   System.out.println("2. Close ");
	   System.out.println("3. Display String Content ");
	   System.out.println("4. Convert Lower Case ");
	   System.out.println("5. Convert Upper Case ");
	   System.out.println("6. Remove stupid ");
	   System.out.println("7. Remove Duplicate Words ");
	   System.out.println("8. Replace String Content ");
	   System.out.println("9. EXIT \n ");
   stringscanner = new Scanner(System.in);
   switch (Integer.parseInt(stringscanner.next()))
   {
   case 1:
	  System.out.println(""); 
	  stringWriter.Write();
	  break;
   case 2:
		  
		  StaticVariables.STRINGWRITERCLOSE=utils.close();
		  System.out.println("Writer is closed..");
	  break;
   case 3:
		  
		   System.out.println(StaticVariables.STRINGWRITER+"\n");
	  break;
   
   case 4:
	   	  System.out.println(StaticVariables.STRINGWRITER+"\n");
		  System.out.println(utils.lowerCase(StaticVariables.STRINGWRITER));
	  break;
   case 5:
	   System.out.println(StaticVariables.STRINGWRITER+"\n");
		  System.out.println(utils.upperCase(StaticVariables.STRINGWRITER));
	  break;
   case 6:
	   System.out.println(StaticVariables.STRINGWRITER+"\n");
	   System.out.println(utils.replace(StaticVariables.STRINGWRITER,"stupid"));
	  break;
   case 7:
	   System.out.println(StaticVariables.STRINGWRITER+"\n");
	   System.out.println(utils.removeDuplicateWord(StaticVariables.STRINGWRITER));
	  break;
   case 8:
	   	System.out.println(StaticVariables.STRINGWRITER+"\n");
		utils.replaceStringValue(utils.removeDuplicateWord(StaticVariables.STRINGWRITER));  
		System.out.println(StaticVariables.STRINGWRITER+"\n");
	  break;
   case 9:
	   innerswitch=true;
		  break;

   
   default: System.out.println("Please enter valid option \n"); 
     
   }
   }while(!innerswitch);
   
   case 2:
	   
	   boolean fileinnerswitch=false;
	   do {
		  
		   System.out.println(" ");
		   System.out.println(" Please select below options ");
		   System.out.println("1. Enter data for file");
		   System.out.println("2. Close ");
		   System.out.println("3. Display file content ");
		   System.out.println("4. Convert Lower Case ");
		   System.out.println("5. Convert Upper Case ");
		   System.out.println("6. Remove stupid ");
		   System.out.println("7. Remove Duplicate Words ");
		   System.out.println("8. Replace File Content ");
		   System.out.println("9. EXIT \n ");
		   filescannse = new Scanner(System.in);
	   switch (Integer.parseInt(filescannse.next()))
	   {
	   case 1:
		  System.out.println(""); 
		  fileWriter.Write();
		  break;
	   case 2:
			  
			  StaticVariables.FILEWRITERLOSE=utils.close();
			  System.out.println("Writer is closed..");
		  break;
	   case 3:
			  
			  
			  System.out.println(utils.readFile(StaticVariables.PATH));
		  break;
	   case 4:
			  
			  
			  System.out.println(utils.lowerCase(utils.readFile(StaticVariables.PATH)));
		  break;
	   case 5:
			  
			  
			  System.out.println(utils.upperCase(utils.readFile(StaticVariables.PATH)));
		  break;
	   case 6:
			  
			  
			  System.out.println(utils.replace(utils.readFile(StaticVariables.PATH),"stupid"));
		  break;  
	   case 7:  
			  
			  System.out.println(utils.removeDuplicateWord(utils.readFile(StaticVariables.PATH)));
		  break; 
	   case 8:  
			  
		   System.out.println(utils.readFile(StaticVariables.PATH));
			  utils.writeFile(utils.removeDuplicateWord(utils.readFile(StaticVariables.PATH)));
			  System.out.println(utils.readFile(StaticVariables.PATH));
		  break; 
	   case 9:
		   fileinnerswitch=true;
			  break;

	   
	   default: System.out.println("Please enter valid option \n"); 
	   
	   }
	   }while(!fileinnerswitch);
	   
  // default: System.out.println("  Invalid option  \n");   
}

	}while(true);
	
/*


WriteInfo writeinfo=new FileWriter(new StringWriter());
writeinfo.Write();

	}*/


	}
}
