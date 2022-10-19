package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		    //Set is an interface,we can't create the object for the set
		//Set s=new Set<>();
		//1.HashSet is unorderd  and it does not contain duplicate element
		//2.Set contains at most one null element
		Set<Object> s=new HashSet<>();
		s.add("Pratiksha");
		s.add('P');
		s.add(34.7f);
		s.add(78);
		s.add("Pratiksha");
		s.add(null);
		s.add(null);
		System.out.println("The elements in the set are: "+s);
		

	}

}
