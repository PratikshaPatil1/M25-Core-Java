package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Naina","Aabha","Pratiksha","Virat");
		
		//forEach-terminal operation
		obj.forEach((i)->System.out.println(i+" "));
		
		System.out.println();
		
		//Stream can be accquired from array or collections
		List<Integer>obj1=Arrays.asList(new Integer[] {34,67,79,29,10,99});
		obj1.forEach((i)->System.out.println(i+" "));

	}

}
