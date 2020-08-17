package Assigment.Final;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountWord {

	public static void main(String[] args) {
		  Map<String, Integer> myMap = new HashMap<>(); 
	      	      
	      Scanner scanner = new Scanner(System.in); 
	      System.out.println("Press ENTER when is done");
	      System.out.println("Please enter the words and separate them with space: ");
	      
	      String input = scanner.nextLine();
	      String[] subWord = input.split(" ");
	            
	      for (String s : subWord) 
	      {
	         String word = s.toUpperCase();
	         if (myMap.containsKey(word))
	         {
	            int count = myMap.get(word);
	            myMap.put(word, count + 1);
	         }else 
	        	 myMap.put(word, 1);
	      } 
	      scanner.close();
	      
	      Set<String> keys = myMap.keySet();
	      TreeSet<String> sortedKeys = new TreeSet<>(keys);

	      System.out.printf("%nWords Keys:%nKey\t\tValue%n");	        
	      for (String key : sortedKeys)
	         System.out.printf("%-10s %8s %n", key, myMap.get(key)); 	      

	}

}
