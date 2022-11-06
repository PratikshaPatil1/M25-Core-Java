package org.tnsindia.multithreading;

public class StaticSynchronizedDemo  {
	 static synchronized void display(String name)
	 {
			 System.out.print("Current thread  " + Thread.currentThread().getName());
			for(int i=0; i<5 ;i++)
			{
			 System.out.println(Thread.currentThread().getName() + " i = " + i);
			 try {
				 Thread.sleep(50);
				} catch (InterruptedException e)
			 {
                 e.printStackTrace();
		 }
	 }

}
}
