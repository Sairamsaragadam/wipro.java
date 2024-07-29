package com.multithreading;

public class Test4 {
	
	public static void main(String[] args) {
		
		Runnable obj = new Test3();
		
		
		Thread t = new Thread(obj);
		t.setName("sai");
		t.start();
		
		
		
	}

}
