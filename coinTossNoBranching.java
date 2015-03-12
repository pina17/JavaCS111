/*********
Author:        Ulises Pina
Course:        CS 111 Intro to CS I
Section:       Mon/Wed 11:10am
Homework #:    Homework 2, Problem 2
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

public class coinTossNoBranching

{
	public static final double TOTAL_TOSSES = 8;
	public static final double MULT_BY_100 = 100;
	public static final String RESULT = "h"; 
	
	public static void main (String[] args)
	{
		
		String toss1;
		String toss2;
		String toss3;
		String toss4;
		String toss5;
		String toss6;
		String toss7;
		String toss8;
		
		
		int numOfHeads;
		int numOfTails;
		
		double percentOfHeads;
		double percentOfTails;
		
		
		
		// INPUT OF THE COIN RESULT
		toss1 = JOptionPane.showInputDialog("Please enter the result of "  
											 + "the first toss: ");

		
		toss2 = JOptionPane.showInputDialog("Please enter the result of "  
											 + "the second toss: ");
		
		
		toss3 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the third toss: ");

		
		toss4 = JOptionPane.showInputDialog("Please enter the result of " 
										  + "the forth toss: ");
		
		
		toss5 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the fifth toss: ");
	
		
		toss6 = JOptionPane.showInputDialog("Please enter the result of " 
											 + "the sixth toss: ");
		
		
		toss7 = JOptionPane.showInputDialog("Please enter the result of "
											 + "the seventh toss: ");	
		
		
		toss8 = JOptionPane.showInputDialog("Please enter the result of "
											 + "the eigth toss: ");
		//System.exit(0);
		
		//CALCULATE 
		
		numOfTails = (RESULT.compareToIgnoreCase(toss1) 
			+ RESULT.compareToIgnoreCase(toss2) + RESULT.compareToIgnoreCase(toss3)
			+ RESULT.compareToIgnoreCase(toss4) + RESULT.compareToIgnoreCase(toss5)
			+ RESULT.compareToIgnoreCase(toss6) + RESULT.compareToIgnoreCase(toss7)
			+ RESULT.compareToIgnoreCase(toss8)) / (-12); 
		numOfHeads = (int)TOTAL_TOSSES - numOfTails;
		percentOfHeads = (numOfHeads / TOTAL_TOSSES) * MULT_BY_100;
		percentOfTails = (numOfTails / TOTAL_TOSSES) * MULT_BY_100;
		
		//OUTPUT 
		
		JOptionPane.showMessageDialog(null, "Number of heads: " + numOfHeads 
						+ "\n" + "Number of tails: " + numOfTails  
						+ "\n" + "Percent of heads: " + percentOfHeads + "%" 
						+ "\n" + "Percent of tails: " + percentOfTails + "%");
		
		System.exit(0);
		
	}
}