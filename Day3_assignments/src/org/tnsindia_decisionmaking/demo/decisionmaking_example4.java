package org.tnsindia_decisionmaking.demo;

import java.util.Scanner;

public class decisionmaking_example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5, y=4;
		int result;
		Scanner sca=new Scanner(System.in);
		System.out.println("enter options:");
		char calculation=sca.next().charAt(0);
		switch(calculation)
		{
		case 'a':
			result=x+y;
			System.out.println(result);
			break;
		case 'b':
			result=x-y;
			System.out.println(result);
			break;	
		case 'c':
			result=x*y;
			System.out.println(result);
			break;
		case 'd':
			result=x/y;
			System.out.println(result);
		default:
			System.out.println("Invalid input");
			sca.close();
		}
	}

}
