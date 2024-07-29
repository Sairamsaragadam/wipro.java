package com.wipro.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args)
	{
	
		 List l = new ArrayList();
		

         l.add(Integer.valueOf(42));
         l.add(new String("sai"));
		 l.add(Boolean.valueOf(true));
		 l.add(Character.valueOf('a'));
		 l.add(null);
		 l.add(Integer.valueOf(23));
		 
		 System.out.println(l);
		 System.out.println(l.get(2));
		 System.out.println(l.size());
		 System.out.println(l.contains("sai"));
		 System.out.println(l.indexOf(null));
	}
	}
