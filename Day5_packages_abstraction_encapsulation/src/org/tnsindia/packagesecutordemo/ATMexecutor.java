package org.tnsindia.packagesecutordemo;

import java.util.Scanner;

public class ATMexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATMexecutor obj=new ATMexecutor();
		obj.display(card_no);
	}

	private void display(String card_no) {
		// TODO Auto-generated method stub
		System.out.print("card number is:"+card_no);
	}

}
