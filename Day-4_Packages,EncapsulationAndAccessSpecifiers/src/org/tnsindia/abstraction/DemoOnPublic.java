package org.tnsindia.abstraction;
//Demo on public access specifier 
class B
{
           public String dob="5-12-2000";
           public void display()
           {
        	   System.out.println("The DOB is: "+dob);
           }
           
    
}
public class DemoOnPublic {

	public static void main(String[] args) {
		 B b=new B();
		 b.display();

	}

}
