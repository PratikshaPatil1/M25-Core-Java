package org.tnsindia.finalkeyword;

class FinalVarible
{
	public final float salary=45000f;
	/*void display()
	{
		salary=50000f;
		System.out.println("Salary is :"+salary);
	}*/
}

public class DemoOnFinalVariable {

	public static void main(String[] args) {
          FinalVarible f1=new FinalVarible();
          System.out.println(f1.salary);
          //f1.display();
	}

}
