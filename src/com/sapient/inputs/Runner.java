package com.sapient.inputs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Runner {
	
	public static void main(String[] args) throws IOException {
		
		Command_Line1 calc1 = new Command_Line1();
		calc1.setData(3,args);
		calc1.calData();
		calc1.displayData();
		
		KeyRead_Line2 calc2 = new KeyRead_Line2();
		calc2.Read(3);
		calc2.display();
		calc2.sort();
		calc2.display();
		calc2.find(4);
		
		NumberToWord calc3 = new NumberToWord();
		calc3.fig_to_words(132);
		
		
		
	}
}
