package com.sapient.inputs;
import java.util.Scanner;

public class NumberToWord {
	int n;
	
	public void fig_to_words(int n) {
		
        
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
 
	if (n == 0) {
		System.out.print("Number in words: Zero");
	}
	
        
        if ((n / 1000000) > 0) {
	   words += fig_to_words(n / 1000000) + " million ";
	   n %= 1000000;
	}
	
	if ((n / 1000) > 0) {
	    words += fig_to_words(n / 1000) + " thousand ";
	    n %= 1000;
	}
	
	if ((n / 100) > 0) {
	     words += fig_to_words(n / 100) + " hundred ";
	     n %= 100;
	}
 
	if (n > 0) {
	     
	     if (n < 20) { 
                    
                    words += unitsArray[n];
             } else { 
                
                words += tensArray[n / 10]; 
                if ((n % 10) > 0) {
		    words += "-" + unitsArray[n % 10];
                }  
	     }
          }
	  System.out.print("Number in words: ");  fig_to_words(n));
   }
}


