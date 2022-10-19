package org.tnsindia.superkeyword;

//super  class
class Parent
{
	public void print()
	{
		System.out.println("Welcome to M25 Batch");
	}
}
//child class
class Child extends Parent
{
	public void print()
	{
		System.out.println("Congratulation for your Selection in Screening round");
	}

public void display()
	{
		print();
		super.print();
	
	}
}
public class DemoOnSuperClassMethod {

	public static void main(String[] args) 
	{
		Child c =new Child();
		c.display();

	}
}


