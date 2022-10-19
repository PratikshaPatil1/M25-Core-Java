package org.tnsindia.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	//LinkedHashSet is follows the insertion order
	public static void main(String[] args) {
		Set<Object> s=new LinkedHashSet<>();
		s.add("Pratiksha");
		s.add('P');
		s.add(34.7f);
		s.add(76);
		s.add("Pratiksha");
		s.add(null);
		s.add(null);
		//to extract the elements from set
		for(Object itr:s)
		{
			System.out.println(itr);
		
		}
           System.out.println("The elements in the set are: "+s);
	}

}
