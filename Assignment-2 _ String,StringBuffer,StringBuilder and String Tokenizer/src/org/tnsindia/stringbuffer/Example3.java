package org.tnsindia.stringbuffer;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer("Jeva");
	    System.out.println(sb);
	    System.out.println(sb.charAt(1));
	    sb.setCharAt(1, 'a');
	    System.out.println(sb);
	    System.out.println(sb.charAt(1));
		s.close();

	}

}
