package com.interview.prep.codingExercise;

public class PrintEvenOddNumbers {
	
	//This class is only for printing the numbers
	
     boolean isEven = false;
	 synchronized void printEven(int number){
		  
		 
		 //Here if even is true , it has to wait and the other thread can print the odd number, vice versa
		 
		 System.out.println("TEST  :"+isEven);
		 while(isEven == true){
			 
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 System.out.println("This is the Even Number :"+number+"  "+Thread.currentThread().getName());
		 isEven = true;
		 notify();
	  }
	  
	 synchronized void printOdd(int number){
		  
		 
		 while(isEven == false){
			 
			 try {
				 wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 System.out.println("This is the Odd Number :"+number + "  "+Thread.currentThread().getName());
		 isEven= false;
		 notify();
		 
	  }
	

}
