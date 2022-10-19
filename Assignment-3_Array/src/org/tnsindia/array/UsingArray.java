package org.tnsindia.array;

import java.util.Arrays;

public class UsingArray {
	static void display(int... a)
	{
		//Array.sort defines Array is a class and
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		   display(99,32,1,78,84,2,43);

	}

}
