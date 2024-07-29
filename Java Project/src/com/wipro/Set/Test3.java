package com.wipro.Set;

import java.util.TreeSet;

public class Test3 {
public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		

		Employe em1=new Employe(4562,"Sai");
		Employe em2=new Employe(4544,"Naveen");
		Employe em3=new Employe(4622,"Ram");
		
		ts.add(em1);
		ts.add(em2);
		ts.add(em3);
		
		for(Object o:ts) {
			System.out.println(o);
		}
}
	

}
