package org.tnsindia.mapdemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		//TreeMap does not contains null key but it contains many null value
		//SortMap<String,String>obj=new TreeMap<>();
		NavigableMap<String,String>obj=new TreeMap<>();
		obj.put("Pratiksha", "Student");
		obj.put("Shreya", "Doctor");
		obj.put("Yamini", "Engineer");
		obj.put("Gargi", null);
		System.out.println(obj);
		//to extract the pairs from map
		for(Map.Entry m:obj.entrySet())
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(obj.firstEntry());
		System.out.println(obj.lastEntry());
		System.out.println(obj.lastKey());

	}

}
