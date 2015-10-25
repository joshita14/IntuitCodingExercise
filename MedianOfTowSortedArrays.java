	package com.interview.prep.codingExercise;
	/*
	 * NOTES :
	 * 
	 * This problem can be converted to the problem of finding kth element, k is (A's length + B' Length)/2.
	 * 
	 * Which of the complexity is bigger :
	 * O(m+n)log(m+n) / O(m+n)
	 * 
	 *  case 1. m+n == odd number, the median lies in array A
		case 2. m+n == odd number, the median lies in array B
		case 3. m+n == even, the median is the quotient of two numbers, both of which are from A.
	 */
	public class MedianOfTowSortedArrays {
	
		
		//https://www.youtube.com/watch?v=_H50Ir-Tves
		
		
		//Pseudo code
		
		/**
		 *say we have array like 
		 *arr ={ 1,2,3,4,5,6}
		 *arr1 ={7,8,9,10}
		 *
		 *now first find the median of two independent arrays
		 *if the median is same then we are solved at one pass only
		 *if m2 > m1 means the median of array2 > array1
		 *then all the elements >than m2 need to be changed, they are largest elements
		 *but we are not sure how elements from arr2 to m2-1, will be added and also see the elements > m1
		 *
		 *when m2 < m1, then elements less than m2 will always be less , now placement of elements > than m2 needs to be checked.
		 *and elements less than m1 needs to be handled
		 *
		 *  now check if the size of array == 2, if yes , we take 
		 *  median = (max(arr1[0],arr2[0]))+(min(arr1[1],arr2[1]))
		 *
		 */
	}
