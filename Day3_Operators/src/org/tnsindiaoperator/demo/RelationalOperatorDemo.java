package org.tnsindiaoperator.demo;

import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();//5
		int b=s.nextInt();//6
		boolean result=(a==b);
		boolean result1=(a!=b);
		
		System.out.println("The result is: "+result);//false
		System.out.println("The result is: "+result1);//true
		s.close();
	}

}
