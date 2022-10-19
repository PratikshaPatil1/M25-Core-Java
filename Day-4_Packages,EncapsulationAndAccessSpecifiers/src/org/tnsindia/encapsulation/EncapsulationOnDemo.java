package org.tnsindia.encapsulation;

public class EncapsulationOnDemo {

	public static void main(String[] args) {
		MaharashtraBank m=new MaharashtraBank();
		//setting the values using setters method
		m.setPin_no(4655);
		//returing the output using getters method
		System.out.println("The pin of ATM is: "+m.getPin_no());

	}

}
