package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {
  
	
	static int a=12;
	//int b=30;
	static int b;
	//static block-used to initialize static data members
	static
	{
		b=a+30;
	}
	
	public static void main(String[] args) {
		System.out.println("value of a: "+a);
		System.out.println("value of a: "+b);

	}

}
