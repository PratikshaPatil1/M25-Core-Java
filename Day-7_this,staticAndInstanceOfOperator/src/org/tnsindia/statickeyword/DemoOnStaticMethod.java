package org.tnsindia.statickeyword;
//static keyword with Method
class A
{
	//non-static method
	int add(int a,int b)
	{
		return a+b;
	}
	//static mehtod
	public static void display()
	{
		System.out.println("Welcome to INDIA");
	}
}
public class DemoOnStaticMethod {

	public static void main(String[] args) {
		A.display();

	}

}
