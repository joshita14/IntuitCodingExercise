package com.interview.prep.codingExercise;

import java.util.ArrayList;

public class TV {

	String name;
	String year;
	String price;
	
	static ArrayList<TV>  tvdetails = new ArrayList<TV>();
	
	TV(String tvname, String tvyear, String tvprice){
		
		this.name = tvname;
		this.year = tvyear;
		this.price = tvprice;
	}
	
	

}
