package com.interview.prep.codingExercise;

public class ImplementArrayListUsingArrays {
	
	int index;
	Object array[];
	Object newArray[];
	
	public static final int MAX_LIMIT = 5;
	
	int size;
	
	ImplementArrayListUsingArrays(){
		this.array = new Object[MAX_LIMIT];
		this.size = MAX_LIMIT;
	}
	
	void add(Object e){
		
		System.out.println("Index  "+this.index+"  and the size "+this.size);
		
		if(this.index == this.size-1){
			//We have space in array and can add elements in the array;
			
			 createNewArrayList(e);
		}
		//We have space in array and can add elements in the array
		array[this.index] = e;
		this.index++;
	}
	
	
	void createNewArrayList(Object e){
		
		int newCapacity = MAX_LIMIT*2;
		newArray = new Object[newCapacity];
		
		for(int i=0; i< array.length-1 ;i++){
			
			newArray [i] = array[i];
			
		}
		
		this.array = newArray;        //good step
		
		System.out.println("This is new Array"+ newArray.length);
		System.out.println("adding the new element");
	}
	
	Object[] removeElement(int i) throws ArrayIndexOutOfBoundsException{
		
		
		if(i > this.array.length-1){
			throw new ArrayIndexOutOfBoundsException();
		}
		if(i < 0){
		   System.out.println("Negative Value");	
		}
		
		System.out.println("Object getting removed :"+this.array[i]);
		
		//Have to shift all the elements
		for(int j=i; j< array.length-1 ;j++){
			
			array[j] = array[j+1];        //Complexity O(n), iterate each step and keep moving
			
		 }
		
		this.index --; 
		array[array.length-1] = null;    //one time step as the last and the second last elements will be same then.
		
		return array;
	}
	
	
	void get(int i) {
	
		try{	
			if(i > array.length-1){
				throw new ArrayIndexOutOfBoundsException();
			}
			
			if(i < array.length-1){
				
				System.out.println("Negative value index "+ "  This is array length :"+array.length);
				throw new Exception("Please input correct array index");
			}
			
			System.out.println(" This is the array value "+array[i]);  //complexity O(1), constant time, we exactly know where we are
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("The index you are trying to get is not present in the array :"+"  This is array length :"+array.length);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}	
		
		
		
	
	}
	
	//Logic is to create array, this array will be increased when we have the limit reached
	public static void main(String[] args) {
		
		ImplementArrayListUsingArrays array = new ImplementArrayListUsingArrays();
	
		array.add("Zero");
		array.add("One");
		array.add("two");
		array.add("three");
		array.add("four");
		array.add("five");
		array.add("six");
		array.add("seven");
		array.add("eight");
		array.add("nine");
		
		Object[] arr = array.removeElement(3);
		
		for(Object on : arr){
			System.out.println((String)on);
		}
		
		array.get(12);
	}

}
