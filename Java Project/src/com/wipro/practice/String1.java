package com.wipro.practice;

public class String1 {
	
	public static String reverseString(String inputString) {
		char[] charArray = inputString.toCharArray();
		
	
		int left = 0;
        int right = charArray.length - 1;
        
       
        while (left < right) {
          
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            
            left++;
            right--;
        }
        
        
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String inputStr = "hello";
        String reversedStr = reverseString(inputStr);
        
        System.out.println("Input: " + inputStr);
        System.out.println("Reversed: " + reversedStr);
    }
   		
		
		
	}


