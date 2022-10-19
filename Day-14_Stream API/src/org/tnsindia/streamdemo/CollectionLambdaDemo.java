package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<>();
		obj.add(35);
		obj.add(78);
		obj.add(56);
		System.out.println(obj);
		
		/*
		  for(Integer itr:obj)
		 {
		    System.out.println(itr+" ");
		  }*/
		//instead of using looping statement we can extract the set element using one line of
		//Stream api
		obj.forEach(System.out::println);
				
				                                                   

	}

}