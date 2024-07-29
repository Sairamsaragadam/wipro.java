package com.wipro.cfw;

import java.util.Comparator;

import com.wipro.Set.Employe;

public class EmployeIDComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		   
		Employe em1 = (Employe)o1;
		Employe em2 = (Employe)o2;
		
		
		return em2.getEmid().compareTo(em1.getEmid());
	}

}
