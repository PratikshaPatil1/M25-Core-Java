package org.tnsindia.wrapperclasses;

public class AutoBoxingExample {

	public static void main(String[] args) {
		//conversion of primitive type to its corressponding wrapper class object
		char ch='z';
		
		//auto-boxing
		Character c=ch;
		
		Character c1=new Character('x');
		
		System.out.println(ch+" "+c+" "+c1);

	}

}
