package com.NLP;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class similarity3 {
	 /**
	   * Calculates the similarity (a number within 0 and 1) between two strings.
	   */
	 

	  public static void main(String[] args) {
		  int i;
		  String[] features = {"size","weight","build","colors","display","resolution",
				  "water","resistance","hands","voice","cameras","battery","storage",
				  "processor","ram","software","price","speaker","touch","screen","secondary"
				  ,"primary","audio","video","music","sound","bluetooth","nfc","gps","wifi",
				  "usb","sensors","memory","graphics","apps","warranty"};
		  
				  

		  String content = null, f = null;
	        File file = new File("C:/Users/Mohan/Desktop/process1.txt"); //for ex foo.txt
	        HashMap <String,ArrayList<String>> map = new HashMap <String,ArrayList<String>>(); 
	       
	        try {
	        	Scanner fip1 = new Scanner(file);
	        	
	            for  (i = 0; i < features.length; i++)
	            {
	            	map.put(features[i], null);
	            }
	            
	            Integer ONE = new Integer(1);
	            while (fip1.hasNext()) 
	            {
	                int flag = 1;
	                String s1 = fip1.next();
	                s1 = s1.toLowerCase();
	                for  (i = 0; i < features.length; i++) 
	                {
	                    f=features[i];
	                    if(similarity(f,s1)>0.750)
	                    {
	                    	System.out.println(map.get(f));
	                    	map.put(f,(map.get(f)+1));
	                    	printSimilarity(f,s1);
	                    	System.out.println(map.get(f));
	                    }
	                }
	            }
	            for  (i = 0; i < features.length; i++)
		            System.out.println(features[i]+" " +map.get(features[i]));
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	  
	      
}
}                		



