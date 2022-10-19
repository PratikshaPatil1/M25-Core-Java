package org.tnsindia.abstraction;
//Demo on private access specifier
class A
{
	//private varible
	private float salary;

	//setters and getters to access private data numbers
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}




public class DemoOnPrivate {

	public static void main(String[] args) {
		A a=new A();
		a.setSalary(45000);
		System.out.println("The salary is: "+a.getSalary());

	}

}
