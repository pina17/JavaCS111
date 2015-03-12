/*************
 *Author:        Ulises Pina
 *Course:        CS 111 Intro to CS I
 *Section:       Mon/Wed 11:10am
 *Homework #:    Homework 3, Problem 1
 *Last Modified: 8 February 2015
 ************/
 
/***********
 *Mortgage Calculator
 ***********
 *Program Description:
 *This program is suppose to get calculate the mortgage and out the outstanding 
 *balance, new balance and how much goes to toward interest
 ***********
 *Algorithm:
 *1)
 *2)
 *3)
 *4)
 *5)
 *6)
 *7)
 *8)
 *9)
 **********/

import java.util.Scanner;

public class mortgageCalculator
{
	public static final double MONTHLY_RATE = .0749 / 12;
	
	public static void main (String[] args)
	{
		double outstandingBalance1;
		double principalAmount1;
		double interestAmount1;
		double newBalance1;
		double monthlyPayment1;
		
		double outstandingBalance2;
		double principalAmount2;
		double interestAmount2;
		double newBalance2;
		double monthlyPayment2;
		
		double outstandingBalance3;
		double principalAmount3;
		double interestAmount3;
		double newBalance3;
		double monthlyPayment3;
		String temp;
		
		Scanner keyboard = new Scanner(System.in);
		
				//Input: outstanding balance
		
		System.out.print("Please enter first outstanding balance: ");
		
		temp = keyboard.nextLine();
		outstandingBalance1 = Double.parseDouble(temp);
		
		System.out.print("Please enter second outstanding balance: ");
		
		temp = keyboard.nextLine();
		outstandingBalance2 = Double.parseDouble(temp);
		
		System.out.print("Please enter third outstanding balance: ");
		
		temp = keyboard.nextLine();
		outstandingBalance3 = Double.parseDouble(temp);

		
				//Input: Monthly Payment
		
		System.out.print("\nPlease enter first monthly payment: ");
		
		temp = keyboard.nextLine();
		monthlyPayment1 = Double.parseDouble(temp);
		
		System.out.print("Please enter second monthly payment: ");
		
		temp = keyboard.nextLine();
		monthlyPayment2 = Double.parseDouble(temp);
		
		System.out.print("Please enter third monthly payment: ");
		
		temp = keyboard.nextLine();
		monthlyPayment3 = Double.parseDouble(temp);	
		keyboard.close();
		
		
				// Calculations
		
		interestAmount1 = monthlyPayment1 * MONTHLY_RATE;
		principalAmount1 = monthlyPayment1 - interestAmount1;
		newBalance1 = outstandingBalance1 - monthlyPayment1;
		
		interestAmount2 = monthlyPayment2 * MONTHLY_RATE;
		principalAmount2 = monthlyPayment2 - interestAmount2;
		newBalance2 = outstandingBalance2 - monthlyPayment2;
		
		interestAmount3 = monthlyPayment3 * MONTHLY_RATE;
		principalAmount3 = monthlyPayment3 - interestAmount3;
		newBalance3 = outstandingBalance3 - monthlyPayment3;
		
				//Output
		
		System.out.printf("%n" + "The principal for the first case is $%.2f %n "
							,principalAmount1);
		System.out.printf("The amount that you pay of interest is $%.2f %n "
							,interestAmount1);
		System.out.printf("Your new balance is $%.2f %n",newBalance1);
		
		System.out.printf("%n" + "The principal for the second case is $%.2f %n "
							,principalAmount2);
		System.out.printf("The amount that you pay of interest is $ %.2f %n "
							,interestAmount2);
		System.out.printf("Your new balance is $%.2f %n ",newBalance2); 
		
		System.out.printf("%n" + "The principal for the third case is $%.2f %n "
							,principalAmount3);
		System.out.printf("The amount that you pay of interest is $%.2f %n "
							,interestAmount3);
		System.out.printf("Your new balance is $%.2f %n ",newBalance3);
		
	}
}