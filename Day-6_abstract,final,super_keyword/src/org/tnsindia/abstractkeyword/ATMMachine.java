package org.tnsindia.abstractkeyword;
//program on abstract class and Abstract method
//if any class contains  one abstract method then that class must be declare as"abstract"
abstract class A
{
	abstract void print();
}
class B extends A
{
	@Override
	void print() {
		 int balance=97000;
				 
		System.out.println("Account balance is: "+balance);
	}
}
public class ATMMachine {

	public static void main(String[] args) {
		//we cannot create the object for abstract class
		/*A a=new A();*/
		A a=new B();
		a.print();
		

	}

}
