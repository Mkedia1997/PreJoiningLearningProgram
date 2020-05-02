package com.sapient.Int_Arr_Process;

public class Int_Arr_ProcessRunner {

	public static void main(String[] args) {
		Int_Arr_Process a = new Int_Arr_Process(6);//array size to 6
		a.readArray();
		a.displayArrayHorizontally();
		a.displayArrayVertically();
		a.sortArray();
		a.biggestAndSmallestArray();
		a.sumOfArray();
		a.secondBiggest();
		
		System.out.println("2. Default Array Size");
		
		Int_Arr_Process b = new Int_Arr_Process();//default array size 
		b.readArray();
		b.displayArrayHorizontally();
		b.displayArrayVertically();
		b.sortArray();
		b.biggestAndSmallestArray();
		b.sumOfArray();
		b.secondBiggest();
		
		
		
		
	}

}
