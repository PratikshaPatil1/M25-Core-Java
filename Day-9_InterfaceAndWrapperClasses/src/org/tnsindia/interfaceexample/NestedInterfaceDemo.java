package org.tnsindia.interfaceexample;

import java.util.Scanner;

//3.Program on Nested-Interface
//outer interface
interface InterfaceOuter
{
	//abstract method by default
	void print();
	//inner interface
	interface InnerInterface
	{
		//abstract method by default
		void display();
	}
}
class ImplementableClass implements org.tnsindia.interfaceexample.InterfaceOuter.InnerInterface
{

	@Override
	public void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch: ");
		String str=s.nextLine();
		System.out.println("The batch is: "+str);
		
	}
	
}
class ImplementableClassF implements InterfaceOuter
{

	@Override
	public void print() {
		System.out.println("Working on Nested Interface");
		
	}
	
}
public class NestedInterfaceDemo {
	

	public static void main(String[] args) {
		ImplementableClass i=new ImplementableClass();
		i.display();
		ImplementableClassF i1=new ImplementableClassF();
		i1.print();

	}

}

	

