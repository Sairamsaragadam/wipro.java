package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class test1 {
	
        public static void main(String[] args ) {
        	
        	List<String> names = Arrays.asList("Sai","Ram","Naveen","Hakeem","Power");
        	
        	List<String> filterdNames = names.stream().filter(x->x.startsWith("N")).collect(Collectors.toList());
        	   System.out.println(filterdNames);
        	
        	
        	
        	
        	
        }
}
