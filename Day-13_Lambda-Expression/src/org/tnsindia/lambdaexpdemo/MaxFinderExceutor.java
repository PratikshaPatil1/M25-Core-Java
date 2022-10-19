package org.tnsindia.lambdaexpdemo;

public class MaxFinderExceutor {

	public static void main(String[] args) {
		/*MaxFinderChildDemo d=new MaxFinderChildDemo();
		 d.max(23,21);*/
		 //Lambda Expression
		/*MaxFinderDemo obj=(int a,int b)->
		 {
		        int result=(a>b)?a:b;
		        
		        System.out.println("The maximum number is:" +result);
		        };
		        obj.max(13,98); */
		
		//lambda expression without return type
		MaxFinderDemo obj=(a,b)->a>b?a:b;
		System.out.println("The maximum no.is:" +obj.max(25, 9));

	}

}
