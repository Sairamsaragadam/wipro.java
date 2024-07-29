package com.wipro.Set;

import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		Mobile m1 = new Mobile(36000,"IQOO");
		Mobile m2 = new Mobile(25000,"Realme");
		Mobile m3 = new Mobile(60000,"IPhone");
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		
		for(Object o:ts) {
			System.out.println(o);
		}
		 
	}

}
