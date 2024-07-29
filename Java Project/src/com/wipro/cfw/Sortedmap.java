package com.wipro.cfw;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap {
	
	public static void main (String[] args) {
		
       SortedMap<Employe,Integer> sm = new TreeMap();
		
		sm.put(new Employe(1,"rk"), 100);
		sm.put(new Employe(-3,"smith"),34);
		sm.put(new Employe(22,"john"), 12);
		
		System.out.println(sm);
	}
	

}
