package org.tnsindia.application;

import org.tnsindia.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc []";
	}
	

}
