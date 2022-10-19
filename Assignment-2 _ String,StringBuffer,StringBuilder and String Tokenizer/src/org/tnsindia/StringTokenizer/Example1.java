package org.tnsindia.StringTokenizer;

import java.util.StringTokenizer;

public class Example1 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Lets try this");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

	}

}
