package com.interview.prep.codingExercise;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueueMain {

	
	static BlockingQueueTakeAndPut cl = new BlockingQueueTakeAndPut();
	
	public static void main(String[] args) {
		//A BlockingQueue does not accept null elements
		
		
		Thread putThread = new Thread(new Runnable(){    
        
			@Override
			public void run() {
				// TODO Auto-generated method stub
			for(int i=0; i<20 ;i++){
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String element = "elementIsHere"+i;
				cl.put(10,element);
			  }
			}
			
		});
		
		Thread takeThread = new Thread(new Runnable(){
	        
				@Override
				public void run() {
					// TODO Auto-generated method stub
					cl.take();
				}
				
			});
		
		takeThread.setName("Consumer Thread");
		putThread.setName("Consumer Thread");
		
		takeThread.start();
		putThread.start();
		 
	}
}
