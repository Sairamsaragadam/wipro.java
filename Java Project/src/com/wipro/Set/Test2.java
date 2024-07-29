package com.wipro.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		
		Set l = new LinkedHashSet();
		
		l.add("ram");
		l.add(14);
		l.add('n');
		l.add(null);
		l.add("false");
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains("ram"));
		System.out.println(l.isEmpty());
		
		
		for (Object o : l)
		{
			System.out.println(o);
		}
	}

}
