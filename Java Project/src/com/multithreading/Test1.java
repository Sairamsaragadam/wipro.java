package com.multithreading;

public class Test1 extends Thread {
	
	public void run () {
	
		System.out.println(Thread.currentThread().getName());		
	}

	 public static void main(String[]args) {
		 
		 
		 Test1 obj = new Test1();
		 obj.setName("sai");
		 
		 Test1 obj1 = new Test1();
		 obj1.setName("ram");
		 
		 
		 obj.start();
		 obj1.start();
		 
		 
	 }
	
	
	
}
