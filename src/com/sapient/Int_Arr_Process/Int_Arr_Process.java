package com.sapient.Int_Arr_Process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Int_Arr_Process {
	int n;
	List<Integer> array;
	
	public Int_Arr_Process() // 1. default constructor
	{
		this.n=10;
		array = new ArrayList<Integer> (n);
	}
	public Int_Arr_Process(int n) // 2. Constructor to specify the given size of Array
	{
		this.n=n;
		array = new ArrayList<Integer> (n);	
	}
	public Int_Arr_Process(List<Integer> array) // 3. Constructor to adopt a given array
	{
		this.n=array.size();
		array = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
			this.array.add(array.get(i));	
	}
	Int_Arr_Process(Int_Arr_Process arr)	// 4. Copy Constructor
	{
		this.n=arr.n;
		for(int i=0;i<arr.n;i++) {
			this.array.add(arr.array.get(i));
			}
	}
	public void readArray(){		// 5. Read Array
		for(int i=0;i<n;i++) {
			array.add(read.br.nextInt());
		}
	}
	
	public void displayArrayHorizontally() {		// 6.1. DisplayArrayHorizontally
		for(int i=0; i<n; i++) {
			System.out.print(array.get(i) + " ");
		}	
		System.out.println();
	}
	public void displayArrayVertically() {			// 6.2 DisplayArrayVertically
		for(int i=0; i<n; i++) {
			System.out.println(array.get(i));
		}	
	}
	public void sortArray() {  					// 7. Sort the array
		Collections.sort(array);
	}
	
	public void biggestAndSmallestArray() {		// 8. Biggest and Smallest Element
		System.out.println("The biggest number :- " + Collections.max(array));
		System.out.println("The smallest number :- " + Collections.min(array));
	}
	
	public void sumOfArray() {			// 9. Sum Of array
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=array.get(i);
		}
		System.out.println("Sum of the elements :- " + sum);
	}

	public void secondBiggest() { 			// 10.	SecondMax Element
		int Max = 0,secondMax = 0;
		for(int i=0;i<n;i++) {
			int num=array.get(i);
			if(num>Max) {
				Max = num;	
			}
		}
		for(int i=0;i<n;i++) {
			if(secondMax<array.get(i)&& array.get(i)<Max) {
				secondMax = array.get(i);
			}
		}
		System.out.println("Second Biggest element of the Array is " + secondMax);
	}
	
	

}
