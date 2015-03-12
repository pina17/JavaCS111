/*********
Author:        Ulises Pina
Course:        CS 111 Intro to CS I
Section:       Mon/Wed 11:10am
Homework #:    Homework 5, Problem 2
Last Modified: 22 Feb. 2015
**********
Exam Score Program
**********
Program Description:
This Program will get the exam score inputted by the user and output the result of 
how many score inputted and the number A's, B's, C's, D's, F's and their percent inputted.. .
**********
Pseudocode:
 1)INPUT testScores
 2)WHILE testScores are >= 0 and <= 100
 3)ASSIGN isNotValid = testScore < 0 or >100
 4)IF isNotValid
 	THEN
 5)OUTPUT: Error Message
 6)END IF
 7)IF testScore >= 90
 	THEN 
 8)increment numOfAs by 1
 9)ELSE IF testScore >= 80
 	THEN
 10)increment numOfBs by 1
 11)ELSE IF testScore >= 70
	THEN
 12)increment numOfCs by 1
 13)ELSE IF testScore >= 60
 	THEN 
 14)increment numOfDs by 1
 15)ELSE increment numOfFs by 1
 16)END IF THEN ELSE IF
 17)END WHILE
 18)CALCULATE total number of scores: totalNumOfScores = numOfAs + numOfBs
 										+ numOfCs + numOfDs + numOfFs
 19)CALCULATE percent of A's: percentOfAs = numOfAs / totalNumOfScores
 20)CALCULATE percent of B's: percentOfBs = numOfBs / totalNumOfScores
 21)CALCULATE percent of C's: percentOfCs = numOfCs / totalNumOfScores
 22)CALCULATE percent of D's: percentOfDs = numOfDs / totalNumOfScores
 23)CALCULATE percent of F's: percentOfFs = numOfFs / totalNumOfScores
 24)OUTPUT: totalNumOfScores
 25)OUTPUT: numOfAs and percentOfAs
 26)OUTPUT: numOfBs and percentOfBs
 27)OUTPUT: numOfCs and percentOfCs
 28)OUTPUT: numOfDs and percentOfDs
 29)OUTPUT: numOfFs and percentOfFs
**********/

import java.util.Scanner;

public class examScoresLoopProgram
{
	public static final double MULT_BY_100 = 100;
	public static void main (String[] args)
	{
		int numOfAs;
		int numOfBs;
		int numOfCs;
		int numOfDs;
		int numOfFs;
		int totalNumOfScores;
		int testScore;
		
		double percentOfAs;
		double percentOfBs;
		double percentOfCs;
		double percentOfDs;
		double percentOfFs;
		
		totalNumOfScores = 0;
		numOfAs = 0;
		numOfBs = 0;
		numOfCs = 0;
		numOfDs = 0;
		numOfFs = 0;
		testScore = 0;
		
		Scanner keyboard = new Scanner (System.in);
		
			
			while(testScore >= 0 && testScore <= 100)
			{
				System.out.println("Please enter grade (-1 to exit): ");
				testScore = keyboard.nextInt();

			
				if(testScore >= 90 && testScore <= 100)
				{
					numOfAs++;
				}
				else if(testScore >= 80 && testScore < 90)
				{
					numOfBs++;
				}
				else if(testScore >= 70 && testScore < 80)
				{	
					numOfCs++;
				}
				else if(testScore >= 60 && testScore < 70)
				{
					numOfDs++;
				}
				else if(testScore >= 0 && testScore < 60)
				{
					numOfFs++;
				}
				else if (testScore == -1)
				{
					
				}
				else
				{
					System.out.println("Not a valid score");
					testScore = 0;
				}
			
			
			}
			
			totalNumOfScores = numOfAs + numOfBs + numOfCs + numOfDs+ numOfFs;
			percentOfAs = (double)numOfAs / totalNumOfScores * MULT_BY_100;
			percentOfBs = (double)numOfBs / totalNumOfScores * MULT_BY_100;
			percentOfCs = (double)numOfCs / totalNumOfScores * MULT_BY_100;
			percentOfDs = (double)numOfDs / totalNumOfScores * MULT_BY_100;
			percentOfFs = (double)numOfFs / totalNumOfScores * MULT_BY_100;
			
			System.out.println("Your total scores entered is: " + totalNumOfScores);
			System.out.println("Number of A's = " + numOfAs 
								+ " which is " + percentOfAs + "%");
			System.out.println("Number of B's = " + numOfBs 
								+ " which is " + percentOfBs + "%");
			System.out.println("Number of C's = " + numOfCs 
								+ " which is " + percentOfCs + "%");
			System.out.println("Number of D's = " + numOfDs 
								+ " which is " + percentOfDs + "%");
			System.out.println("Number of F's = " + numOfFs 
								+ " which is " + percentOfFs + "%");
			
			

	} 
}