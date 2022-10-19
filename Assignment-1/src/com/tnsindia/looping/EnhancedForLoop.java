package com.tnsindia.looping;

public class EnhancedForLoop {

	public static void main(String[] args) 
	{
        int [] no= {10,20,30,40};
        
        for(int x: no) {
        	System.out.print(x);
        	System.out.print(",");
		}
        
		String [] names= {"Pratiksha","Bhumi"};
		for(String y: names) {
			System.out.print(y);
            System.out.print(",");
		}
		

	}

}
