package org.tnsindia.framework;
//abstract class
public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	//Constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}   
    //getters and setters method

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	//abstract method
		abstract public void withdraw(float accBal);
	    public void deposite(float accBal )
		{
			System.out.println(accBal);
	    	 
	     }	 
    	  
      }
      
      
      
      
      
      
      