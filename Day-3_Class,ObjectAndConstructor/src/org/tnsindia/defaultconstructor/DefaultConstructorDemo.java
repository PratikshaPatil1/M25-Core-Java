package org.tnsindia.defaultconstructor;
//class definition
class Car
{
	//varible
	public int speed;
	//method
	void display()
	{
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//default constructor
	Car()
	{
		speed=70;
	}
}
public class DefaultConstructorDemo {

	public static void main(String[] args) {
	    //object creation
		Car obj=new Car();
		//obj.speed=70;
		//calling the method of class 
		obj.display();

	}

}
