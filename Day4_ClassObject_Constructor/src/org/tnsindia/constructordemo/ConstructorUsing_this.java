package org.tnsindia.constructordemo;

public class ConstructorUsing_this {
int salary;
String name;
ConstructorUsing_this(int salary,String name){
	this.salary=salary;
	this.name=name;
}
void print() {
	System.out.println("The salary of "+name+" is "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorUsing_this s1= new ConstructorUsing_this(20000,"Manoj");
		s1.print();
	}

}


