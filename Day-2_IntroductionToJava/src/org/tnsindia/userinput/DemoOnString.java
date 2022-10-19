package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnString {

	public static void main(String[] args) {
		        //for user-input
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the value of String: ");
				String x=s.nextLine();
				System.out.println("The result is: ");
				System.out.print(x);
                s.close();
	}

}
