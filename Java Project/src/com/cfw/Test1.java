package com.cfw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(44, "sai");
		m.put(201, "Hakeem");
		m.put('r', "302");
		m.put(201, null);
		m.put(null, null);
		m.put(82, "sai");
		m.put(9.23f, 'm');
		
		System.out.println("Size is : "+ m.size());
		System.out.println(m.containsKey(44));
		System.out.println(m.isEmpty());
	   Set s = m.entrySet();
		System.out.println(s); 
		
	}
	
	
	

}