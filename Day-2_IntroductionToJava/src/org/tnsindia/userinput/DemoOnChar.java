package org.tnsindia.userinput;
//program on user-input for char data-type

import java.util.Scanner;


public class DemoOnChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
	    char x=s.next().charAt(4);
		System.out.println("The result is:");
		System.out.print(x);

	}

}
