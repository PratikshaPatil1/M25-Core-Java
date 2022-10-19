package org.tnsindia.array;

public class Varargs 
	{
		//varible argument...(ellips)=>
		static void print(int a,int b, String... s)
		{
			System.out.println(a+","+b);
			//To print VARARGS
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]+"\t");
			}
	}

	public static void main(String[] args) {
		//fun call
		print(13,45,"Java","C++","Python");

	}

}
