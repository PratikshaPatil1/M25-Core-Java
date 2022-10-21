package org.tnsindia.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExPatternMethodDemo {

	public static void main(String[] args) {
		String pattern="Pratiksha Patil";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input for a matching: ");
		
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);

	}

}
