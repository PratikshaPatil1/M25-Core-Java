package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1042,"Pratiksha Patil",20000,true);
		CurrentAcc c=new MMCurrentAcc(1111,"Gargi Deore",25000,500 );
		
		System.out.println("Saving Account Deatils: ");
		s.withdraw(s.getAccBal());
		
		System.out.println();
		System.out.println("Current Account Details: ");
		c.withdraw(c.getAccBal());
	
		System.out.println();
		System.out.println("Saving Account Deatils: ");
		s.deposite(s.getAccBal());
		
		System.out.println();
		System.out.println("Current Account Details: ");
		c.deposite(c.getAccBal());
		

	}

}
