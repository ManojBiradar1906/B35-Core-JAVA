package org.tnsindiaoperator.demo;

import java.util.Scanner;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("The addition is: "+(a+b));
		System.out.println("The subtraction is: "+(a-b));
		System.out.println("The multiplication is: "+(a*b));
		System.out.println("The division is: "+(a/b));
		System.out.println("The modulous is: "+(a%b));
		s.close();
	}

}
