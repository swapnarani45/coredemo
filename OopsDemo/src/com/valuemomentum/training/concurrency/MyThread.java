package com.valuemomentum.training.concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread Objex=new MyThread();
		Objex.create();
		System.out.println("this is main thread");
		

	}
	public void create()
	{
		Thread Objth=new Thread(this);
		Objth.start();
	}

	public void run()
	{
		while(true)
		{
			try {
				
			
		
		System.out.println("this is class thread");
					Thread.sleep(500);
					
	}
	catch(InterruptedException e)
			{
}
		}
	}
}
