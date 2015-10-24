package com.interview.prep.programmingpuzzles;

import java.util.Arrays;

public class Palindrome {
	
	/**
	 * Number which gives the same number on reversal
	 * A palindrome number is a number that is same after reverse. like 121
	 */
	
	int j,i;
	char[] array ;
	boolean palindrome(String number){
	
		array = number.toCharArray();
		char [] newarray = Arrays.copyOf(array, 3);
		j = array.length-1;
		i = 0;
		
		while(i<j){
				swap(i,j,array);
				j--;
				i++;
			}
		boolean result = Arrays.equals(newarray, array);
		System.out.println(result);
		return true;
	}
	
	void swap(int i, int j,char [] array){
		
		char s ;
		s = array[i];
		array[i] = array[j];
		array[j] = s;	
	}
	
	
	void anotherway(int number){
		//palindrome number
		
		int reverse = 0;
	
		while(number !=0){
			
			reverse = reverse*10 + number%10; //(% will give you last digit)
			number = number /10;
		}
	}
	public static void main(String[] args) {
		
		Palindrome plan = new Palindrome();
		plan.palindrome("121");
	}

}
