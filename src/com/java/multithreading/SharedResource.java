package com.java.multithreading;

class SharedResource {
    private boolean flag = false;
    private static int num = 0;
    
    synchronized void produce() {
        try {
            while (flag) {
                wait();  // Wait until consumer consumes
            }
            System.out.println("Producing...");
            flag = true;
            notify(); // Notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!flag) {
                wait(); // Wait until producer produces
            }
            System.out.println("Consuming...");
            flag = false;
            notify(); // Notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    //Popular interview question
    synchronized void printEven() {
    	try {
    		while (flag) {
    			wait();
    		}
    			if(num%2 == 0)
    			{System.out.println(num + " Thread Even");
    			num++;}
    			flag = true;
    			notify();
    	}
    	catch (InterruptedException e) {
    		
    		e.printStackTrace();
    	}	
    }
    
    synchronized void printOdd() {
    	try {
    		while(!flag)
    		{
    			wait();
    		}
    		if(num%2 != 0)
    		{
    		  System.out.println(num + " Thread Odd");
    		  num++;
    		}
    		flag = false;
    		notify();
    	}
    	catch (InterruptedException e)
    	{
    		e.printStackTrace();
    	}
    }



















}




