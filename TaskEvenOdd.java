package com.interview.prep.codingExercise;

public class TaskEvenOdd implements Runnable{

	PrintEvenOddNumbers printNumbers;
	int max;
	private boolean isEvenNumber;
	volatile int number;
	
	
	TaskEvenOdd(PrintEvenOddNumbers print, int maximum, boolean natureOfNumber){
		this.printNumbers = print;
		this.max = maximum;
		this.isEvenNumber = natureOfNumber;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		number = isEvenNumber == true ? 2:1;
		
		System.out.println("Entered" + Thread.currentThread().getName());
		while(number <= max){
			
			if(isEvenNumber){
				System.out.println("EVEN");
				printNumbers.printEven(number);
			}else {
				System.out.println("ODD");
				printNumbers.printOdd(number);
			}
			
			System.out.println("Here");
			number += 2;//to make that even or odd, anything
					
		}
		
	}
}
