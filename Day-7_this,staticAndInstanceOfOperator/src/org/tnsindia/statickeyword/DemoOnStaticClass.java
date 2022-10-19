package org.tnsindia.statickeyword;
class C
{
	//static variable
	public static String str="WELCOME TO MAHARASHTRA";
	/*A class can be made static only if it is a nested class*/
	//static class
	static class D
	{
		//static method
		/*If this method is non-static then we have to create the object*/
		public static void print()
		{
			System.out.println(str);
		}
	}
}
public class DemoOnStaticClass {

	public static void main(String[] args) {
		//object creation
		//C.D obj=new org.tnsindia.statickeyword.C.D();
		//obj.print();
		C.D.print();

	}

}
