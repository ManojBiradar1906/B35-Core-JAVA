package org.tnsindiaoperator.demo;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//increment
		int a=13,b=5;
		a++;//13+1
		int y=a;//y=14
		System.out.println(b);//5
		++b;//6
		System.out.println(b);//6
		System.out.println(y);//14
		
		//decrement
		int x=4,z=11;
		--x;//3
		z--;
		System.out.println(z);//10
		int p=++z;//11
		System.out.println(x);//3
		System.out.println(p);//11
	}

}
