package org.tnsindia.encapsulationdemo;

public class HDFCexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFC h=new HDFC();
	
		
		//setters method is used for a to set a value
		h.setAmount(84760);
		//getter method is used to return a value
		System.out.println("The amount is: "+h.getAmount());
		
		
		//Driver code for PublicDemo class
		/*if any data member is declared as public we can access
		anywhere*/
		PublicDemo p=new PublicDemo();
		p.print(4376.98);
	}

}
