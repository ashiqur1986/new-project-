package com.talentect.pageobject;

public class Veriable_Java {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		int sub;
		
		num1= 10;
		num2= 30;
		
		
		sum= num1+num2;
		
		if(num1>num2) {
			sub=num2-num1;
			System.out.println(sub);
		}//end if
		else {
			sub=num2+num1;
			System.out.println(sub);
		}//end else 
	
		
		
		//System.out.println("Addition"+sum);
		//System.out.println("Subtraction"+sub);

	}

}
