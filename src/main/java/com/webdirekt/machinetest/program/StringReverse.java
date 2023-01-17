package com.webdirekt.machinetest.program;

public class StringReverse {
  
	public static void main(String[] args) {
		System.out.println(StringReverse.stringReverse("India is my Country"));
	}
	
	public  static String stringReverse(String str) {
       String result ="";
		String words[] = str.split("\\s");
		
		for(int i=0;i<words.length;i++) {
			String qt= words[i];
			String st = "";
			for(int j=qt.length()-1;j>=0;j--) {	
				st= st+ qt.charAt(j);
			}
			
		//	System.out.print(st);
			result =result +st +" ";
		}
		
		return result;
		
	}

	
	
}
