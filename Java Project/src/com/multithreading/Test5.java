package com.multithreading;

public class Test5 {
public static void main(String[] args) {
		
		
		Runnable obj = ()->{
			
			for(int i=1;i<=20;i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
			}
		
		};
	
		
		Thread t = new Thread(obj);
		t.setName("sai");
		t.start();
		
		Thread t1 = new Thread(obj);
		t1.setName("ram");
		t1.start();
		
	}

}
