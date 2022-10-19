package org.tnsindia.strings;

import java.util.Scanner;

public class Example8_Concat_Method {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		//String str1=s.nextLine();
		//System.out.println(str1.length(1));
		System.out.println(12+12+"hello"+"world"+5+12);
		System.out.println(str1.concat(str2));
		s.close();

	}

}
