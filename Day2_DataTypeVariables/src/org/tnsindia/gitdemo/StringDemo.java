package org.tnsindia.gitdemo;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the String:");
		String str=s.nextLine();
		String str1=s.next();
		
		System.out.println("The output is: ");
		
		System.out.println("The String is: "+str);
		System.out.println("The String is: "+str1);
		s.close();

	}

}
