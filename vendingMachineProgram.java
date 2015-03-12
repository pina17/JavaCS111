/*************
 *Author:        Ulises Pina
 *Course:        CS 111 Intro to CS I
 *Section:       Mon/Wed 11:10am
 *Homework #:    Homework 3, Problem 3
 *Last Modified: 8 February 2015
 ************/
 
/***********
 *Vending Machine Program
 ***********
 *Program Description:
 *This program is suppose to 
 ***********
 *Algorithm:
 *1)
 *2)
 *3)
 *4)
 *5).
 *6)
 *7)
 *8)
 *9)
 **********/


import java.util.Scanner;

public class vendingMachineProgram

{
	public static final int HUNDRED_CENTS = 100;
	
	public static void main (String[] args)
	
	{
		int itemPrice;
		int change;
		int quarter;
		int nickel; 
		int dime;
		String temp;
		
		Scanner keyboard = new Scanner(System.in);
		
			//INPUT
		System.out.print("Please enter price of item \n");
		System.out.print("(from 25 cents to a dollar, in a 5 cent increments): ");
		temp = keyboard.nextLine();
		itemPrice = Integer.parseInt(temp);
		keyboard.close();
		
			//CALCULATION
		change = HUNDRED_CENTS - itemPrice;
		quarter = change / 25;
		dime = (change - (quarter * 25)) / 10;
		nickel = (change - (quarter * 25) - (dime * 10)) / 5;
		
			//OUTPUT
		System.out.println("You bought an item for " + itemPrice 
						+ "and you gave a dollar so your change is: \n");
		System.out.println(quarter + " quarters");
		System.out.println(dime + " dimes");
		System.out.println(nickel + " nickels \n");
	}
}