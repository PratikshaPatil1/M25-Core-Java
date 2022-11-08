package org.tnsindia.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float accBal)
	{
	        System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
	        +","+"Account Balance is: "+(accBal+creditLimit));
	}
	public void deposite(Float accBal)
	{
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
		+","+"Account Balance is: "+this.getAccBal());
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	
	

}
