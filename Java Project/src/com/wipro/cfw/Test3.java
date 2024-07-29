package com.wipro.cfw;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		 
		for(int i=1;i<=10;i++) {
			
			al.add(i);
		}	
      Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			
			int x = itr.next();
			    if(x%2!=0) {
			    	
			    	itr.remove();
			    }
		} 
		
		
		
		System.out.println(al);
	}
	
	
	
}
