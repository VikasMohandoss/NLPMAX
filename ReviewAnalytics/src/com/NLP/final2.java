package com.NLP;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class final2 {
	 /**
	   * Calculates the similarity (a number within 0 and 1) between two strings.
	   */
	public class Mystruct 
	{
		public Integer freq;
		public ArrayList<String> words;
		public double sentiment;
	}
	  public static double similarity(String s1, String s2) {
	    String longer = s1, shorter = s2;
	    if (s1.length() < s2.length()) { // longer should always have greater length
	      longer = s2; shorter = s1;
	    }
	    int longerLength = longer.length();
	    if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
	    /* // If you have StringUtils, you can use it to calculate the edit distance:
	    return (longerLength - StringUtils.getLevenshteinDistance(longer, shorter)) /
	                               (double) longerLength; */
	    return (longerLength - editDistance(longer, shorter)) / (double) longerLength;

	  }

	  // Example implementation of the Levenshtein Edit Distance
	  // See http://rosettacode.org/wiki/Levenshtein_distance#Java
	  public static int editDistance(String s1, String s2) {
	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();

	    int[] costs = new int[s2.length() + 1];
	    for (int i = 0; i <= s1.length(); i++) {
	      int lastValue = i;
	      for (int j = 0; j <= s2.length(); j++) {
	        if (i == 0)
	          costs[j] = j;
	        else {
	          if (j > 0) {
	            int newValue = costs[j - 1];
	            if (s1.charAt(i - 1) != s2.charAt(j - 1))
	              newValue = Math.min(Math.min(newValue, lastValue),
	                  costs[j]) + 1;
	            costs[j - 1] = lastValue;
	            lastValue = newValue;
	          }
	        }
	      }
	      if (i > 0)
	        costs[s2.length()] = lastValue;
	    }
	    return costs[s2.length()];
	  }

	  public static void printSimilarity(String s, String t) {
	    System.out.println(String.format(
	      "%.3f is the similarity between \"%s\" and \"%s\"", similarity(s, t), s, t));
	  }

	  public static void main(String[] args) {
		  int i;
		  String[] features = {"Size","Weight","Build","Colors","Display","resolution",
				  "Water","resistance","Hands","voice","Cameras","Battery","Storage",
				  "Processor","RAM","Software","price","speaker","Touch","screen","Secondary"
				  ,"primary","audio","video","music","sound","bluetooth","nfc","gps","wifi",
				  "usb","sensors","memory","graphics","apps","warranty"};
		  
				  

		  String content = null, f = null;
	        File file = new File("C:/Users/Mohan/Desktop/process1.txt"); //for ex foo.txt
	        HashMap <String, Object> map = new HashMap(); 
	        
            
	        try {
	        	Scanner fip1 = new Scanner(file);
	        	
	            for  (i = 0; i < features.length; i++)
	            {
	            	map.put(features[i], 0);
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



