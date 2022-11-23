

package org.tnsindia.constructordemo;

public class EmployeeDemo {
	int salary;
	String name;
	EmployeeDemo(int s, String n){
	salary=s;
	name=n;
	}
	
void print() {System.out.println("Employee name:"+name+" "+"Salary: "+salary);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDemo e1=new EmployeeDemo(25000,"Nikita");
		EmployeeDemo e2=new EmployeeDemo(45000,"Chaitali");

		e1.print();
		e2.print();
	}

}
