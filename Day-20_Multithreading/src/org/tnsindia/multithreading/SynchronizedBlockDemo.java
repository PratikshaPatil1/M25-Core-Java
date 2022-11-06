package org.tnsindia.multithreading;

public class SynchronizedBlockDemo {
	void printSynchronizedBlockDemo(int n) {
		synchronized(this) {//synchronized block
			for(int i=1;i<=5;i++) 
			{
				System.out.println(n*i);
				
				try {
					Thread.sleep(50);
				} catch(Exception e)
				{
				      System.out.println(e);
			      }
			   }
	     	}
	}
	
		
	}


