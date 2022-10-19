package com.tnsindia.assignmentquestion;

public class ExampleEnhancedForLoop {

	public static void main(String[] args) 
	{
		 int [] no= {10,20,30,40};
		 {
	        for(int x: no) {
	        	System.out.print(x);
	        	System.out.print(",");
			}
	        
			String [] names= {"Aarohi","Hina"};
			for(String y: names) {
				System.out.print(y);
	            System.out.print(",");
			}
			

		}

	

	}

}
