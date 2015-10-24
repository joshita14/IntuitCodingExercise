package com.interview.prep.codingExercise;

public class SimpleBasicExampleWait_Notify{

  /*
   * This class will show a basic working example for wait and notify
   * 
   * We will print statements and one statement will wait for the other statement
   * 
   * Its very simple and excellent example
   */
	
	static Wait_Notify wn = new Wait_Notify();
	
	public static void main(String[] args) {
		
		Thread waiterThread  = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
			    wn.producer();
			}
			
		});
		
		
		Thread notifierThread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				wn.consumer();
			}
			
		});
		
		waiterThread.start();
		notifierThread.start();
		
	}
	
}
