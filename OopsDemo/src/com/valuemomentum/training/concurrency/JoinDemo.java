package com.valuemomentum.training.concurrency;

public class JoinDemo extends Thread{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) throws InterruptedException {
		JoinDemo t1=new JoinDemo();
		JoinDemo t2=new JoinDemo();
		JoinDemo t3=new JoinDemo();
		
		t1.start();
		
		t1.join();
		
		t2.start();
		
		t3.start();
		
		
	}

}
