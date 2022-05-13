package com.transactional.monitor.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.transactional.monitor.model.Transaction;

public class GenerateText {
	public static void main(String[] args) throws IOException {
		
	    File file = new File(
	        "tex_int22.txt");

	    BufferedReader br = new BufferedReader(new FileReader(file));
	    String st;
        int count=0;
        
        Map<String,Integer> map = new HashMap<>();
        
	    while ((st = br.readLine()) != null) {
	    	 String[] words = st.toString().split(" ");
	    	
	    	 for (String string : words) {
	    		 if(map.containsKey(string)) {
	    			 map.put(string, map.get(string)+1);
	    		 }else {
	    			 map.put(string, 1);
	    		 }
			}
	    	 
	    	 	 
		}
	    
	    System.out.println(map);
	}
}
