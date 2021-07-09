package com.Bridgelabz;
import java.util.Scanner;

public class PrimenumberFind {
	public void findprimeNumber()       
	{
	

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first no : ");
	int first = sc.nextInt();
	System.out.print("Enter last no : ");
	int last = sc.nextInt();
	System.out.println("Prime numbers between " + first + " and " + last + " are : ");
	int count;
	for (int i = first; i <= last; i++) 
	{
		count = 0;
		for (int j = 1; j <= i; j++)
		{
			if (i % j == 0)
				count = count + 1;
		}
		if (count == 2)
			System.out.println(i);
	}
}
  	//main method
		public static void main(String[] args) {
			PrimenumberFind primeNoRange=new PrimenumberFind();
			primeNoRange.findprimeNumber();
	
}
}
