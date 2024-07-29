package com.wipro.Set;

import java.util.Comparator;

public class EmployeNameComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		
		

		Employe em1 = (Employe)o1;
		Employe em2 = (Employe)o2;
		
		return em2.getEmname().compareTo(em1.getEmname());
				
				
	}

}
