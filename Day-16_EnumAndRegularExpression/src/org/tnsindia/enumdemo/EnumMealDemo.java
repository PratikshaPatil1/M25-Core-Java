package org.tnsindia.enumdemo;

public class EnumMealDemo {

	public static void main(String[] args) {
		//we cannot create the object enum
		//Meal m=new Meal();
		for(Meal m:Meal.values())
		{
			System.out.println(m+" "+m.getValue());
		}

	}

}
