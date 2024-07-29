package com.wipro.Set;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		
		Set l = new HashSet();
		
		l.add("sai");
		l.add(44);
		l.add('r');
		l.add(null);
		l.add("true");
		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("sai"));
		System.out.println(l.isEmpty());
		
		for (Object o : l)
		{
			System.out.println(o);
		}
	}

}
