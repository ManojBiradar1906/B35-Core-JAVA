package org.tnsindia.gitdemo;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number: ");
		int x=s.nextInt();

		System.out.println("Enter the number: ");
		float y=s.nextFloat();

		System.out.println("Enter the char: ");
		char c=s.next().charAt(0);
		//char c=s.next().charAt(1);//h



		System.out.println("The output is: ");
		System.out.println("The integer is: "+x);
		System.out.println("The decimal is: "+y);
		System.out.println("The character is: "+c);
		s.close();

	}

}
