package com.d14.test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



import org.junit.jupiter.api.Test;


import com.d14.utils.Utils;

class FileReadWriteTest {
	
	@Test
	public void upperCase() {
		Utils utils=new Utils();
		String upperCase=utils.upperCase("digital");
		assertEquals("DIGITAL", upperCase);
		
	}
	@Test
	public void lowerCase() {
		Utils utils=new Utils();
		String lowerCase=utils.lowerCase("DIGITAL");
		assertEquals("digital", lowerCase);
		
	}
	
	@Test
	public void replace() {
		Utils utils=new Utils();
		String replaceVal=utils.replace("This is stupit issue", "stupit");
		assertEquals("This is s***** issue", replaceVal);
		
	}
	
	@Test
	public void removeDuplicateWord() {
		Utils utils=new Utils();
		String removeDuplicate=utils.removeDuplicateWord("This is is my name");
		assertEquals("This is my name", removeDuplicate);
		
	}
	
	
	
	@Test
	public void givenWritingStringToFile_whenUsingPrintWriter_thenCorrect() 
	  throws IOException {
	    FileWriter fileWriter = new FileWriter("F:\\ a.txt");
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    printWriter.print("Some String");
	    printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
	    printWriter.close();
	}
}
