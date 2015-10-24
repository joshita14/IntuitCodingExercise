package com.interview.prep.codingExercise;

public class Wait_Notify {

	
	int number  = 0;
	
	public void producer(){
		
		synchronized(this){
			System.out.println("In producer block");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Was notified by the notifier and it incremented the value even : "+number);
		}
	}
	
	public void consumer(){
		
		synchronized(this){
			System.out.println("In consumer block");
		    number++;
		    System.out.println("I have incemented the number, notifying the waiting thread");
		    
		    notify();
		}
	}
}
