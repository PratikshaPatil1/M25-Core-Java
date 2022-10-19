package org.tnsindia.stringbuffer;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer buff=new StringBuffer("Internet of things");
		System.out.println(buff.capacity());
		buff=new StringBuffer(" ");
		System.out.println(buff.capacity());
		s.close();

	}

}
