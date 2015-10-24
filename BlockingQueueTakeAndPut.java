package com.interview.prep.codingExercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Understand like this : 
 * 
 * There is one queue and many 2 threads are working on the same queue
 * Now, when we have inserted the elements in the queue, we need to wait, and release the lock on the queue
 * The other thread can hold  lock on the queue and then can remove elements from the queue and notify the producer
 * Producer can again resume the operation and insert elements in the queue.
 */

public class BlockingQueueTakeAndPut 
{
       ArrayList<String> s = new ArrayList<String>();
       
        Queue <String> queue = new LinkedList<String>();
   	
       
		void put(int capacity, String element){
		
			//waiting on queue
			synchronized(queue){
				
			   while(queue.size() == capacity){
				    
				    System.out.println("The array is full , I am producer need to wait");
				
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//System.out.println("Now the length of array is  :"+queue.size() +"  can put more items");
			queue.add(element);
			queue.notify();
		    
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("Added the element, Notified the consumer"+" I am thread :"+Thread.currentThread().getName());
		}//sync
	   }
	
	
      void take(){

	     synchronized(queue){
			//waiting on queue
			while(queue.isEmpty() ||queue == null){
				System.out.println("There are no elements in the array, I am consumer need to wait");
				
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			queue.remove();
			//System.out.println("Now the length of the array is : "+queue.size()+" can take out items");
			queue.notify();
			System.out.println("Removed The element, Notified the producer"+" I am thread :"+Thread.currentThread().getName());
			//s.add(e);
	        }
		 }

}
