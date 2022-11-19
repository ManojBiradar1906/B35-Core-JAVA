package org.tnsindiaoperator.demo;

import java.util.Scanner;

public class AssignmetOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		a*=b;
		b*=a;
		System.out.println("The value of a is: "+a);//a=20
		System.out.println("The value of a is: "+b);//b=5*20
		
		s.close();
	}

}
