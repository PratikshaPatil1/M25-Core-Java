package org.tnsindia.application;

import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
	      MMSavingAcc s=new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return c;
	}
	

}
