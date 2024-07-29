package com.wipro.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedHashSet;


public class Test3 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		
		l.add(14);
		l.add(19);
		l.add(9);
		l.add(-8);
		l.add(1);
		l.add(-2);
		l.add(24);
		l.add(65);
		l.add(14);
		l.add(35);
		
		{
			int max = (int) l.get(0);
			int min = (int) l.get(0);
			
			for (int i = 1; i < l.size(); i++) {
				if (l.get(i) > max) {
					max = l.get(i);
				}
				if (l.get(i) < min) {
					min = l.get(i);
				}
			}
			
			
			System.out.println("Maximum value in the list: " + max);
			System.out.println("Minimum value in the list: " + min);
			}
		Collections.sort(l);
		
		System.out.println("Sorted list in ascending order; " + l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Sorted list in descending order: " + l);
		
		
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(l);
		l.clear();
		for(Integer o : s) {
			l.add(o);
		}
		
		Collections.sort(l);
		System.out.println("After deleting duplicates: "+l);
		
		for(Integer o : l) {
			System.out.println(o);}
			
      }
	

	}


