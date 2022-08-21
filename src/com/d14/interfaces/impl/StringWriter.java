package com.d14.interfaces.impl;

import java.util.Scanner;

import com.d14.constants.StaticVariables;
import com.d14.interfaces.WriteInfo;

public class StringWriter implements WriteInfo {

	
	
	private Scanner sc;

	@Override
	public void Write() {
		// TODO Auto-generated method stub
		if(!StaticVariables.STRINGWRITERCLOSE) {
		System.out.print("Please add the string value \n");
		sc = new Scanner(System.in);
		StaticVariables.STRINGWRITER= StaticVariables.STRINGWRITER+sc.nextLine()+"\n";
		System.out.println("StaticVariables :"+StaticVariables.STRINGWRITER);
		}
		else
			System.out.println("Alreay writer closed Please Exit ..\n");
		
		
	}

}
