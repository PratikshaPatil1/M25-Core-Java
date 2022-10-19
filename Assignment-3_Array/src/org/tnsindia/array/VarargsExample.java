package org.tnsindia.array;

import static java.lang.System. *; 

public class VarargsExample {
	static void print(int a, int y,String... s)
	{
		   System.out.println(a +","+ y);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i] + "\t");
		}
	       System.out.println();
			
	}

	public static void main(String[] args) {
		print(3,2,"Java","Java 5");
        System.out.println("Next invoke");
		print(1,2,"a","b","c","d","e");

	}

}
