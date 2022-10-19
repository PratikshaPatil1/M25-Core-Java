package org.tnsindia.lambdaexpdemo;

public class RunnableInterfaceDemoUsingLambdaExp {

	public static void main(String[] args) {
		/*Runnable is an interface which contains one method -run()*/
		/*Runnable obj=new Runnable()
		 {
		       @Override
		       public void run() {
		           System.out.println("Implementing runnable interface");
		           
		           }
		           
		           };
		           
		//Thread is a class that implementing runnable interface
		 Thread t=new Thread(obj);
		 //when u call start mehtod it jumps to run mehtod
		  t.start();*/
		
		//implementing runnable interface using lambda expression
		Runnable obj=()->
		{
			System.out.println("Implementing runnable interface");
		};
		Thread t=new Thread(obj);
		t.start();

	}

}
