package org.tnsindia.overriding;
import java.util.Scanner;
//parent class
class HeadQuarters
{
	protected int totalemp;
	protected String city;
	Scanner s=new Scanner(System.in);
	public void getDetails()
	{
	   System.out.println("Enter the city where HeadQuaters is situated: ");
	   city=s.nextLine();
	   System.out.println("Enter the total no.of employees in the city headquaters");
	   totalemp =s.nextInt();
}
	
	public void showDetails()
	{
		System.out.println("Company is located in:" +city+" and the no.of employee is:" +totalemp);
	}
}
//child class
class MainBranch extends HeadQuarters
{
	public int totalempMB;
	public String citynameMB;
	
	//method Overriding
	public void getDetails()
	{
		System.out.println("HeadQuarters");
		super.getDetails();
		System.out.println("Main branch");
		System.out.println("Enter the city where Main -Branch is situated: ");
		s.nextLine();
		citynameMB=s.nextLine();
		System.out.println("Enter the total no.of employee in the main branch ");
		totalempMB=s.nextInt();
	}
	//method overriding
	public void showdetails()
	{
		super.showDetails();
		System.out.println("Main Branch");
	 	System.out.println("Company is located in: "+citynameMB+" and the no.of empolyee is:" +totalempMB);
	 	
	
	}
}
public class DemoOnMethodOverriding {

	public static void main(String[] args) {
		MainBranch m=new MainBranch();
		m.getDetails();
		m.showDetails();
	   
	
	}

}

