package org.tnsindia.multithreading;

public class SynchronizedBlockExample1 implements Runnable{
	Thread t;
	SynchronizedBlockDemo s;
	SynchronizedBlockExample1(SynchronizedBlockDemo s){
		this.s=s;
		t =new Thread(this);
		t.start();
	}

	public void run() {
		s.printSynchronizedBlockDemo(5);
		
	}
		
	}
	


