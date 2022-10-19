package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {34,98,54,90,67,23,35,98});
		//filter()Method
		obj1.stream().filter(i->i>45).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//distinct()method
		obj1.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		//limit(n)
		obj1.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//skip(n)
		obj1.stream().skip(4).forEach((i)->System.out.print(i+" "));
		

	}

}
