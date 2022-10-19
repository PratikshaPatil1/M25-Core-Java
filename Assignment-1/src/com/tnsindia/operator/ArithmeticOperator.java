package com.tnsindia.operator;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) 
	{  
		int a,b;
		System.out.print("Enter two numbers: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Addition "+(a+b));
		System.out.println("Subtraction "+(a-b));
		System.out.println("Multipication "+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("Remainder "+(a%b));
		s.close();
		
		

	}

}
