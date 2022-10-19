package org.tnsindia.stringbuffer;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1="Today";
		StringBuffer sb=new StringBuffer(s1.length());
		System.out.println(sb.capacity());

	}

}
