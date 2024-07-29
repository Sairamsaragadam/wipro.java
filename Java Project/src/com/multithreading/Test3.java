package com.multithreading;

public class Test3 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

}
