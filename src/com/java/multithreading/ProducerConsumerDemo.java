package com.java.multithreading;

public class ProducerConsumerDemo {
//    public static void main(String[] args) {
//        SharedResource resource = new SharedResource();
//
//        Thread producerThread = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                resource.produce();
//            }
//        });
//
//        Thread consumerThread = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                resource.consume();
//            }
//        });
//
//        producerThread.start();
//        consumerThread.start();
//    }
	
	//Problem 
	public static void main(String[] args) {
		
		SharedResource resource = new SharedResource();
		
		//using lanbda t create a thread:
		Thread printOddThread = new Thread(() -> {
			
			for(int i =0; i<100; i++)
			{
				resource.printOdd();
			}
		});
		
		Thread printEvenThread = new Thread(() -> {
			
			for(int j=0; j<100; j++) {
				resource.printEven();
			}
		});

		printOddThread.start();
		printEvenThread.start();        
    }
}

