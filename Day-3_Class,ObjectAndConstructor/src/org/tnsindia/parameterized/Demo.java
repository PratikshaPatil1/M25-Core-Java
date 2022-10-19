package org.tnsindia.parameterized;
import java.util.Scanner;

	class Bike
	{
	    //varible 
	    public int speed;
	    
	    //Parameterized constructor
	    Bike(int s)
	    {
	    	speed=s;
	    	System.out.println("The speed is:"+speed+"km/hr");
	    }
          //Default constructor
		public Bike() {
			
			System.out.println("Default Constructor");
			
		}
	    
	    
}
	public class Demo  {
          public static void main(String[] args) {
        	  
        	  Scanner s=new Scanner(System.in);
        	  System.out.println("Enter the value of speed: ");
        	  int speed=s.nextInt();
        	  //object creation
        	  Bike b=new Bike();
        	  Bike b1=new Bike(speed);
        	  s.close();
          }
	
	}
	