package com.wipro.cfw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapentrysetwithgenerics {

	   public static void main(String[] args) {
		   
		   Map<Integer, String> m=new HashMap();
		   
		   m.put(44, "sai");
			m.put(201, "Hakeem");
		
			m.put(201, null);
			m.put(null, null);
			m.put(82, "sai");
			
		   
			
		   
		        for(Map.Entry<Integer, String>entry : m.entrySet()) {
					
		        	String value = entry.getValue();
					Integer key = entry.getKey();
					System.out.println(key + ":" + value);
					
				}
	   }
}
