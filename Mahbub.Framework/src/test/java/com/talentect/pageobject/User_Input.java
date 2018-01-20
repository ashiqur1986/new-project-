package com.talentect.pageobject;

import java.util.Scanner;

public class User_Input {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		System.out.println("enter your range");
		int range= s.nextInt();
		
		int sum=0;
		for (int i=1; i<=range;i++) {
			sum=sum +i;
		}
		
	
	}

}
