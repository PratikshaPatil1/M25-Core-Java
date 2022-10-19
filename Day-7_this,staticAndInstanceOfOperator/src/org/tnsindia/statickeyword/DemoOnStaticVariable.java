package org.tnsindia.statickeyword;
class B{
	static int a=45;
}
//static keyword with variable
public class DemoOnStaticVariable {

	/*if we declare any variable outside the main function and we print that var without static
	 *then we will get the error...for that purpose we have to use static keyword 
	 */
	    
	
	
	public static void main(String[] args) {
		System.out.println(B.a);

	}

}
