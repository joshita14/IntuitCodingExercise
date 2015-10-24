package com.interview.prep.codingExercise;

public class PrintEvenOddNumberMain implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
	
		PrintEvenOddNumbers p = new PrintEvenOddNumbers();
		
		Thread t1= new Thread(new TaskEvenOdd(p,10,true));
		t1.setName("Even Thread");
		t1.start();
		
		Thread t2 = new Thread(new TaskEvenOdd(p,10,false));
		t2.setName("Odd Thread");;
		t2.start();
		
	}

}
