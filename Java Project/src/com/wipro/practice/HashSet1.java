package com.wipro.practice;

import java.util.HashSet;

public class HashSet1 {
static HashSet<String> nm = new HashSet<String>();
	
	
	public void uniqueElement() {
		for(String st:nm) {
			System.out.println(st);
		}
	}
	public void presentElement(String s) {
		if(nm.contains(s))
			System.out.println("The String is present");
		else
			System.out.println("it is not present");
	}
	public static void main(String[] args) {
		nm.add("sai");
		nm.add("ram");
		nm.add("hakeem");
		nm.add("power");
		nm.add("naveen");
		
		nm.add("sai");
		nm.add("power");
		nm.add("hakeem");
		new HashSet1().uniqueElement();
		new HashSet1().presentElement("ram");
	}

	
	
	
	
	
	
	
	

}
