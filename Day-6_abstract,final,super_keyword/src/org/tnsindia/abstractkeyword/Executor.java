package org.tnsindia.abstractkeyword;

public class Executor {

	public static void main(String[] args) {
	  Person p=new Employee("Bhumi","Female",1923);
      Person p1=new Employee("Sumit","Male",0);
      System.out.println(p.toString());
      p.work();
      p1.work();
      p.changeName("Pratiksha");
      System.out.println(p.toString());
	}

}
