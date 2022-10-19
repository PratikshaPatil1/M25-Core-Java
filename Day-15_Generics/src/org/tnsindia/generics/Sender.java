package org.tnsindia.generics;

public class Sender <T> 
{
      private T message;
     //create getter and setters method
     public T getMessage() {
	  return message;
}

    public void setMessage(T message) {
	this.message = message;
}
    public void sendMessage(T message) {
    	this.message = message;
    }
    public void sendMessage()
    {
    	System.out.println("Message Type: "+getMessage().getClass());
    	System.out.println("Contents are: "+getMessage());
    }
}
