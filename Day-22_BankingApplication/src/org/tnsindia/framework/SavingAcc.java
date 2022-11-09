package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc{
	
	private boolean isSalary;
	static final private float creditLimit=0.0f;
	//constuctor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
		+","+"Account Balance is: "+this.getAccBal());

	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	

}
