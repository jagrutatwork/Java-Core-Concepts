package com.java.multithreading;

public class Multithreading2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread created by implementing Runnable");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multithreading2 runnablemultithreading2 = new Multithreading2();
		Thread t2 = new Thread(runnablemultithreading2);
		t2.start();

	}


}
