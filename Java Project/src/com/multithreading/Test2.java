package com.multithreading;

public class Test2 extends Thread {
	
	@Override

	public void run () {
		
		for(int i=1;i<=20;i++) {
	
		
		System.out.println(Thread.currentThread().getName() + "-->" + i);
		
		
		            try{ 
		            	 Thread.sleep(1000);
		  	} catch (InterruptedException e) {
		  		
		  		e.printStackTrace();
		  	}		
		}
	}

	 public static void main(String[]args) {
		 
		 
		 Test2 obj = new Test2();
		 obj.setName("sai");
		 
		 Test2 obj1 = new Test2();
		 obj1.setName("ram");
		 
		 
		 obj.start();
		 obj1.start();
		 
		 
	 }
	
}

