package org.tnsindia.multithreading;

public class SynchronizedBlockExecutor {

	public static void main(String[] args) {
		SynchronizedBlockDemo obj=new SynchronizedBlockDemo();
		SynchronizedBlockExample1 t1=new SynchronizedBlockExample1(obj);
		SynchronizedBlockExample2 t2=new SynchronizedBlockExample2(obj);
		


	}

}
