/*********
Author:        Ulises Pina
Course:        CS 111 Intro to CS I
Section:       Mon/Wed 11:10am
Homework #:    Homework 2, Problem 1
Last Modified: 30 January 2014
**********
Coin Toss Program
**********
Program Description:
This Program will get the result of eight coin tosses and output the amount of
heads and talis and their percent of outcome. .
**********
Psuedocode
 1)INPUT result1
 2)INPUT result2
 3)INPUT result3
 4)INPUT result4
 5)INPUT result5
 6)INPUT result6
 7)INPUT result7
 8)INPUT result8
 9)CALCILATE percentOfHead = numOfHead / TOTAL_TOSSES
10)CALCULATE percentOfTail = numOfTail / TOTAL_TOSSES
11)OUTPUT numOfHead
12)OUTPUT numOfTail
13)OUTPUT percentOfHead
14)OUTPUT percentOfTail
**********/


import javax.swing.JOptionPane;

public class coinTossProgram

{
	public static final double TOTAL_TOSSES = 8;
	public static final double MULT_BY_100 = 100; 
	
	public static void main (String[] args)
	{
		String result1;
		String result2;
		String result3;
		String result4;
		String result5;
		String result6;
		String result7;
		String result8;
		
		int numOfHeads;
		int numOfTails;
		
		double percentOfHeads;
		double percentOfTails;
		
		numOfHeads = 0;
		numOfTails = 0;
		
		
		// INPUT OF THE COIN RESULT
		result1 = JOptionPane.showInputDialog("Please enter the result of "  
											 + "the first toss: ");
		if((result1.charAt(0) == 'H') || (result1.charAt(0) == 'h'))
		{
			numOfHeads++;
			
		}
		else 
		{
			numOfTails++;
		}
		
		
		
		///////////////
		result2 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the second toss: ");
		if((result2.charAt(0) == 'H') || (result2.charAt(0) == 'h'))
		{
			numOfHeads++;
			
		}
		else 
		{
			numOfTails++;
		}
		
		
		
		/////////////
		result3 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the third toss: ");
		if((result3.charAt(0) == 'H') || (result3.charAt(0) == 'h'))
		{
			numOfHeads++;
		}
		else
		{
			numOfTails ++;
		}
		
		
		
		/////////////
		result4 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the fourth toss: ");
		if((result4.charAt(0) == 'H') || (result4.charAt(0) == 'h'))
		{
			numOfHeads++;
		}
		else
		{
			numOfTails++;
		}
		
		
		
		//////////////
		result5 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the fifth toss: ");
		if((result5.charAt(0) == 'H') || (result5.charAt(0) == 'h'))
		{
			numOfHeads++;
		}
		else
		{
			numOfTails++;
		}
		
		
		
		//////////////
		result6 = JOptionPane.showInputDialog("Please enter the result of "
											 + "the sixth toss: ");	
		if((result6.charAt(0) == 'H') || (result6.charAt(0) == 'h'))
		{
			numOfHeads++;
		}
		else
		{
			numOfTails++;
		}
		
		
		
		/////////////
		result7 = JOptionPane.showInputDialog("Please enter the result of "
											 + "the seveth toss: ");
		if((result7.charAt(0) == 'H') || (result7.charAt(0) == 'h'))
		{
			numOfHeads++;
		}
		else
		{
			
			
			numOfTails++;
		}
		
		
		
		/////////////
		result8 = JOptionPane.showInputDialog("Please enter the result of "
											 + "the eigth toss: ");
		if((result8.charAt(0) == 'H') || (result8.charAt(0) == 'h'))
		{
			numOfHeads++;
		}
		else
		{
			numOfTails++;
		}
		
		
		//CALCULATE 
	
		percentOfHeads = (numOfHeads / TOTAL_TOSSES) * MULT_BY_100;
		percentOfTails = (numOfTails / TOTAL_TOSSES) * MULT_BY_100;
		
		//OUTPUT 
		
		JOptionPane.showMessageDialog(null, "Number of heads: " + numOfHeads 
						+ "\n" + "Number of tails: " + numOfTails  
						+ "\n" + "Percent of heads: " + percentOfHeads + "%" 
						+ "\n" + "Percent of tails: " + percentOfTails + "%");
		
	}
}