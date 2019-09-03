package oops;

import java.util.Scanner;

public class Employee {
private int id;
private String name;
private double basicSalary;
Employee(int id , String name, double salary){
	this.id = id;
	this.name = name;
	this.basicSalary = salary;
}
public double hra() {
	return basicSalary * 0.30;
}
public double da() {
	return basicSalary * 0.20;
}
public double ta() {
	return basicSalary * 0.10;
}
public double pf() {
	return basicSalary * 0.05;
}
public double gs() {
	return basicSalary + hra() + da() + ta() -pf();
}
public double tax() {
	return gs() * 0.10;
}
public double ns() {
	return gs() - tax();
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Id ");
	int id = s.nextInt();
	System.out.println("Enter the Name");
	String name = s.next();
	System.out.println("Enter the Salary");
	double salary = s.nextDouble();
	Employee emp = new Employee(id, name,salary);
	System.out.println(emp.basicSalary);
	System.out.println(emp.hra());
	System.out.println(emp.da());
	System.out.println(emp.ta());
	System.out.println(emp.pf());
	System.out.println(emp.gs());
	System.out.println(emp.ns());
//	emp.id = id;
//	emp.name = name;
//	emp.basicSalary = salary;
}
}
