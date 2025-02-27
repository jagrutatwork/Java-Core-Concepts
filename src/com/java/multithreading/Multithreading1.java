package com.java.multithreading;


//Threads can be created either by extending Thread class or implementing the Runnable interface

public class Multithreading1 extends Thread{
	
	//When we extend Thread class we need to override the run() method
	public void run() {
		System.out.println("Thread created by extending Thread class");
	}
	
	
	public static void main(String Args[])
	{
		Multithreading1 t1 = new Multithreading1();
		t1.start();
	}
}

