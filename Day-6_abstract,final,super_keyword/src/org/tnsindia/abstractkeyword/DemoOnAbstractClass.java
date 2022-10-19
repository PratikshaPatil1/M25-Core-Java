package org.tnsindia.abstractkeyword;

abstract class C
{
	//abstract class can have abstract and non-abstract method
	//non-abstract method
	void print()
	{
		System.out.println("Non-abstract method");
	}
	abstract void display();
	abstract void accept();
}

class D extends C
{
	@Override
	void display() {
		System.out.println("Abstract method 1");
	}
	
	@Override
	void accept () {
		System.out.println("Abstract method 2");
	}
}
public class DemoOnAbstractClass {

	public static void main(String[] args) {
		C c=new D();
		c.print();
		c.display();
		c.accept();

	}

}
