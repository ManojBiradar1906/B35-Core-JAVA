package org.tnsindia.classdemo;

import java.util.Scanner;

public class ClassObjectDemo {
int speed;
ClassObjectDemo(int s){
	speed=s;
}
void display() {System.out.println("Speed of the car is:"+speed);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the car:");
		int speed=s.nextInt();
		ClassObjectDemo obj = new ClassObjectDemo(45);
		obj.display();
		s.close();
	}

}
