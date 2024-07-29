package com.wipro.Set;
import java.util.TreeSet;
public class Test4 {
public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		Mobile m1 = new Mobile(25000,"IQOO");
		Mobile m2 = new Mobile(35000,"ONEPLUS");
		Mobile m3 = new Mobile(20000,"OPPO");
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		
		for(Object o:ts) {
			System.out.println(o);
		}
		 
	}

}
