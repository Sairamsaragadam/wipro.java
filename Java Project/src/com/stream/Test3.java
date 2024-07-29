package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test3 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,6,5,12,4,9);
		
		Optional<Integer> min = numbers.stream().min((x,y) -> x.compareTo(y));
		
		min.ifPresent(value-> System.out.println("the minimum value is: " + value));
		
		numbers.stream().max(Comparator.naturalOrder()).ifPresent(x->System.out.println("the maximum value is : " + x));
		
		
		
	}

}
