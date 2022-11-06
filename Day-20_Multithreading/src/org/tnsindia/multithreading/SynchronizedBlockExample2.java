package org.tnsindia.multithreading;

public class SynchronizedBlockExample2 implements Runnable{

	Thread t;
	SynchronizedBlockDemo s;
	SynchronizedBlockExample2(SynchronizedBlockDemo s){
		this.s=s;
		t =new Thread(this);
		t.start();
	}

	public void run() {
		s.printSynchronizedBlockDemo(100);
		
	}
		
	

}
