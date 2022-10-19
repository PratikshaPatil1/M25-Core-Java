package org.tnsindia.abstraction;
class C
{
	String VehicleType;
	
	
}
public class DemoOnDefault {

	public static void main(String[] args) {
	     C c=new C();
	     
	     /*If any data members is default then it can access only inside the same packege,
	      * it can not be access outside the another package
	      */
          c.VehicleType="Bus";
          System.out.println("Vehicle Type is: "+c.VehicleType);
	}

}
