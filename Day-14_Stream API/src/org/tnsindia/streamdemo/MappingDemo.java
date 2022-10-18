package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"Naina","AB","Priyanka","Goldi"});
        obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));
	}

}
