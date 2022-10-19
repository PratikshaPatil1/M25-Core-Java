package org.tnsindia.parameterized;
import java.util.Scanner;
//Demo on ParameterizedConstructor
class Bus
{
    //varible 
    public int speed;
    
    //Parameterized constructor
    Bus(int s)
    {
    	speed=s;
    	System.out.println("The speed is:"+speed+"km/hr");
    }


	
   
    
    
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out. println("Enter the value of speed: ");
		  int speed=s.nextInt();
		  //object creation
		  Bus b=new Bus(speed);
		  s.close();
	}

}
