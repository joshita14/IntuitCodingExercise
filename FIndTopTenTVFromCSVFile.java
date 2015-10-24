package com.interview.prep.codingExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class FIndTopTenTVFromCSVFile {
	
	void parseDataFromCSVFile(){
		
		try {
			
			String currentDir = System.getProperty("user.dir");
	        System.out.println("Current dir using System:" +currentDir);
	        
	        
			BufferedReader reader = new BufferedReader(new FileReader(currentDir+"/src/com/interview/prep/codingExercise/CSVFile.csv"));
			String data = null;
			while((data = reader.readLine()) !=null){
				
				String dataTV []  = data.split(",");
				
				TV tvdet = new TV(dataTV[0],dataTV[1],dataTV[2]);
				TV.tvdetails.add(tvdet);
			}
			
//			for(String datag : dataTV){
//				System.out.println(datag);
//			}
			reader.close();
			
			System.out.println(data);
		} catch (FileNotFoundException e) {
		
			System.out.println("Unable to find the file  : CSVFile.csv");
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	void sortList(){
		/*
		 * I have an ArrayList of object. The object contain attributes date and value. 
		 * So I want to sort the objects on the date, and for all objects in the same date I want to sort them on value. 
		 * How can I do that?
		 */
		
		Collections.sort(TV.tvdetails, new comparartorClass());
	}
	
	static class comparartorClass implements Comparator<TV>{

		@Override
		public int compare(TV o1, TV o2) {
			
//		int res = o1.name.compareTo(o2.name);
//			if(res != 0){
//				System.out.println(res);
//				return res;
//			}else{
//				return o1.price.compareTo(o2.price);
//			}
//		}
			//here if the result is 0, then we can compare the two by name and send the result
			int res =o1.name.compareTo(o2.name);
			
			return res == 0 ? o1.year.compareTo(o2.year) : res;
		}
	}
	
	public static void main(String[] args) {
		
		FIndTopTenTVFromCSVFile f = new FIndTopTenTVFromCSVFile();
		f.parseDataFromCSVFile();
		f.sortList();
		
		for(TV s : TV.tvdetails){
			System.out.println("Displaying top ten TV : "+s.name + " "+s.price);
		}
		
      }
	}
