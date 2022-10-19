package org.tnsindia.thiskeyword;
import java.util.Scanner;

class B
{
	public String name;
	public int id;
	B(String name,int id)
	{
		//this keyword is used here to refer current class var
		this.name=name;
		this.id=id;
	}

//user-defined-method
public void print()
{
	System.out.println("The name is: "+name);
	System.out.println("The ID is: "+id);
   }
}

public class DemoOnThisKeywordConstructor {

	public static void main(String[] args) {
		System.out.println("Enter the name: ");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ID: ");
		String name1=s.nextLine();
		int id1=s.nextInt();
		B a=new B(name1,id1);
		a.print();
		

	}

}
