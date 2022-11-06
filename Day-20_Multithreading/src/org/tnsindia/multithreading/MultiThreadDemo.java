package org.tnsindia.multithreading;
//Demo on MultiThread
public class MultiThreadDemo implements Runnable{

	public static void main(String[] args) {
		Thread t1=new Thread("Thread1");
		Thread t2=new Thread("Thread2");
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		//Lowest Priority=1 ByDefault=5 Highest Priority=10
		System.out.println(t1.getPriority());

		System.out.println(t2.getName());
		System.out.println(t2.getPriority());


	}

	@Override
	public void run() {
		//System.out.println("The thread is in the running state");
		
	}
	

}
