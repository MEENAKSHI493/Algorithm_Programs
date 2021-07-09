package com.Bridgelabz;

import java.util.Scanner;
public class Findnumber {
		public static void main(String[] args) 
		{
	        System.out.println("Think of a Number");
	        Scanner scan = new Scanner(System.in);
	        String x = null;
	        String y = null;
	        String i = null;
	        //Get the input from the player
	        System.out.println("Please your maximum value");

	        if (scan.hasNext()) 
	        {
	            x = scan.next();
	        }

	        System.out.println("Please input your minimu value");
	        if (scan.hasNext()) 
	        {
	            y = scan.next();
	        }

	        
	        int max = Integer.parseInt(x);
	        int min = Integer.parseInt(y);

	        boolean numberguessed = true; 
	        int numberofRounds = 0;

	        while(numberguessed) 
	        {
	            int midpoint = (max+min)/2;

	            numberofRounds++;

	            System.out.println("Is your number " + midpoint + " please say too low or too high or correct");
	             if (scan.hasNext()) 
	             {
	                 i = scan.next();
	             }
	             if (i.equalsIgnoreCase("Please print too high")) 
	             {
	                 min = midpoint;

	             
	             
	             }
	             if (i.equalsIgnoreCase(""
	             		+ "lease too low")) 
	             {
	                 max = midpoint;
	                 min = 0;
	             }
	             if (i.equalsIgnoreCase("correct")) 
	             {
	                 System.out.println("The Number of rounds in this game is" + numberofRounds);
	                 break;
	             }

	        }

	    }
	}

