package com.webdirekt.machinetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webdirekt.machinetest.program.StringReverse;

@SpringBootApplication
public class BlogAppApi1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApi1Application.class, args);
		
		StringReverse st = new StringReverse();
		
	    System.out.print(st.stringReverse("India is my Country"));
	}

}
