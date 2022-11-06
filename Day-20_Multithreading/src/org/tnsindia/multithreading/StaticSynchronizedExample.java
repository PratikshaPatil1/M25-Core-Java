package org.tnsindia.multithreading;

public class StaticSynchronizedExample implements Runnable{
	Thread t;
	StaticSynchronizedDemo s;
	String name;
	StaticSynchronizedExample(StaticSynchronizedDemo s)
	{
		this.s=s;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		s.display(name);
	}

}
