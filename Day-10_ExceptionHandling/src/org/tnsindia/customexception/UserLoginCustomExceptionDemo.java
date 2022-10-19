package org.tnsindia.customexception;
import java.util.Scanner;

//Custom Exception for validating the login credentials
class LoginCredentials extends Exception
{
	public String str;
	
	//constructor
	public LoginCredentials(String str) {
		super();
		this.str =str;
	}
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str +"]";
	}
}
public class UserLoginCustomExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in) ;
		System.out.println("Please enter your mail id:");
		String id=s.nextLine();
		System.out.println("Please enter your password:");
		String password=s.nextLine();
		try {
			if(id!="abc@gmail.com" && password!="abc123@")
				throw new LoginCredentials("Invalid Credentials");
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}

	}

}
