package org.tnsindia.StringBuilder;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hive");
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());
		s.close();

	}

}
