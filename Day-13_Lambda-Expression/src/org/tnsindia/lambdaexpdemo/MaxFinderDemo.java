package org.tnsindia.lambdaexpdemo;

public interface MaxFinderDemo {
	
	//1.Functional interface contains exactly one abstract method
	//abstract method
	//void main(int a,int b);
	int max(int a,int b);

}
/*We have implemented functional interface by using child class
  but here the length of the code is incresed,
  so we have another way that is lambda expression*/

/*class MaxFinderChildDemo implements MaxFinderDemo
 {

	@Override
	public int max(int a, int b) {
		int result=(a>b)?a:b;
		System.out.println("The maximum number is:" +result);
		
	}
 }*/
 
