package textManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User enters their favorite national parks program returns a seperated list with the entered values.
 * 
 * @author Alex Murdock
 *
 */
public class LabTextManipulation {

	public static void main(String []args){
		
	     try (Scanner sc = new Scanner(System.in)) {
			ArrayList<String> parks = new ArrayList<String>();
			 String j = " ";
			 
			     for(int i = 0; i < 100; i++){
			    	 
			    	 while(!j.equalsIgnoreCase("done")){
			    		 System.out.print("Please enter your favorite National Park or DONE to stop: ");
				    	 j = sc.nextLine();
				    	 
					    	 if(i == 0) {
					    		 parks.add(capitalizeWord(j));
					    		 break;
					    	 }
				    	 
					    	 parks.add("| " + capitalizeWord(j) );
			    	 }
			    	 
			     }
			 
			     parks.remove(parks.size() - 1);
			 System.out.print("\n" + "Favorite National Parks: " + listToString(parks));
		}
	}
	
	/**
	 * @param of type String
	 * @return an ArrayList without commas or braces and prints the values of the ArrayList using the specified format.
	 */
	private static String listToString(List<String> l) {
		StringBuilder sb = new StringBuilder(32);
		
			for(String el : l) {
				sb.append(el).append(" ");
			}
			
		return sb.toString();
	}

	/**
	 * 
	 * @param str of type String
	 * @return the users input from are Array and sort it in a way that will Capitalize the first letter of each String and lowercase the rest of the string.
	 */
	public static String capitalizeWord(String str){  
	    String words[] = str.split("\\s");
	    String capitalizeWord = "";
	    
		    for(String w : words){  
		        String first = w.substring(0,1);  
		        String afterfirst = w.substring(1);  
		        capitalizeWord += first.toUpperCase() + afterfirst.toLowerCase() + " ";  
		    }  
		    
		return capitalizeWord.trim();  
	}
	
}