package org.tnsindialooping.demo;

import java.util.Scanner;

public class loopingdemo_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			s.close();
		}
	}

}
