package org.tnsindia.abstractkeyword;

public class Employee  extends Person {
	
	private int Eid;
	
	public Employee(String name,String gender,int eid) {
		super(name,gender);
		Eid =eid;
	}

	@Override
	public void work() {
		if(Eid==0)
		{
			System.out.println("Not working");
		}
		else
		{
			System.out.println("Working as a Employee!");
		}
		
	}

}
