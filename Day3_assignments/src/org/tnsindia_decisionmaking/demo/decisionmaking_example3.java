package org.tnsindia_decisionmaking.demo;

public class decisionmaking_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=22, weight=75;
		if(age>18 && age<=21) 
		{
		 if(weight>70) {
			 System.out.println("Eligible for training");
		 }
		}
		else 
		{
			System.out.println("Not eligible");
		}
		if(age>21) {
			if(weight>75) {
				System.out.println("Eligible for training");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
}
			