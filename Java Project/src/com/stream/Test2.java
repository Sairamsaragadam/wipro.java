package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test2 {
	
	 public static void main(String[] args ) {
     	
     	List<String> al = Arrays.asList("sai","ram","naveen","hakeem","power");
     	System.out.println(al);	
     	List<String> filterdNames = al.stream().filter(x->x.startsWith("r")).collect(Collectors.toList());
     	   System.out.println(filterdNames);
     	
     	List<String> upperCaseNames = al.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
     	System.out.println(upperCaseNames);

     	List<String> sortedNames = al.stream().sorted().collect(Collectors.toList());
    	
    	System.out.println(sortedNames); 
    	
    	List<String> sortedNamesDescending=al.stream().sorted( (x,y)->y.compareTo(x)).collect(Collectors.toList());
    	
    	System.out.println(sortedNamesDescending);
	 
    	al.stream().sorted( (x,y)->y.compareTo(x)).forEach(x -> System.out.println(x));
	 
	 
	 }
}
