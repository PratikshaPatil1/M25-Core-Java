package org.tnsindia.framework;

public abstract class ShopAcc {
     private int accNo;
     private String accNm;
     private float charges;
     
     //constructor 
     public ShopAcc(int accNo, String accNm, float charges) {
    	 super();
    	 this.accNo = accNo;
    	 this.accNm = accNm;
    	 this.charges = charges;
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

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
    
	//abstract method
	abstract public void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
    	 
     }
}
