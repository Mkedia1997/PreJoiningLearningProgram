package com.sapient.week1;
public class CheckEven
{
	public CheckEven()
	{

	}
	public static void main(String[] args)
	{
		System.out.println("Program to check even numbers");
	}
	public static Boolean check( int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}