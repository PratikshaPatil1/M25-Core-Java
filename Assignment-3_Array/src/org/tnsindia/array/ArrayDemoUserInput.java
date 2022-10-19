package org.tnsindia.array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values: ");
		//to enter the element in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
		}
		//to print the element in the array in the arry
		/*for(int i=0;i<arr.length;i++)
		 {
		 System.out.println(arr[i]);
		 }*/
		//enhanced for loop
		System.out.println("Your Array Elements: ");
		for(int j:arr)
		{
			System.out.println(j);
		}
		s.close();
		}

		 

	}


