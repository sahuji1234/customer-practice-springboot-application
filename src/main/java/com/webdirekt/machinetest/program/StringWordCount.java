package com.webdirekt.machinetest.program;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {

	public static void main(String[] args) {
		System.out.println(StringWordCount.mostOccurredWord("India is is my country"));
	}
	
       public static Map<String, Integer> mostOccurredWord(String str) {
		
	       String words[]=str.split("\\s");
    	   
    	   Map<String ,Integer> hashMap = new HashMap<>();
		
    	 for(String word: words) {
    		 Integer i = hashMap.get(word);
    	 
    	 if(i== null) {
    		 hashMap.put(word,1);
    	 } else {
    		 hashMap.put(word, i+1);
    	 }
    	 }
		return hashMap;
	}
}
