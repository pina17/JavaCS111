/*************
 *Author: Ulises Pina
 *Course: CS 111 Intro to CS I
 *Section: Mon/Wed 11:10
 *Homework #: Homework 1, Problem 1
 *Last Modified: 27 January 2014
 ************/
 
/***********
 * Integer Program
 ***********
 *Program Description:
 *Picking three whole numbers to add and print out output to user.
 *Then using those sme three numbers to multiply them.
 *Divide the product and sum of those three number to divide them to each other
 ***********
 *Algorithm:
 *1)GREET user to program "Hello User!"
 *2)INITIALIZE varibles; Num1, Num2, Num3, sum for addtion 
 *3)OUTPUT sum to user on command screen
 *4)ALERT user about next step of program: Multiplication
 *5)INITIALIZE  varible for multiplication: product
 *6)OUTPUT the product to the user
 *7)ALERT user about the program next step: Division
 *8)INITIALIZE varible for divsion: quotient
 *9)OUTPUT the the quotient to the user on command screen
 **********/

public class MyFirstProgramInt
{
	public static void main (String[] args)
	{
		//Greeting the user
		System.out.println("Hello User!");
		System.out.println("Lets do a simple calculation.");
		
		//initoalizing the varibles for addtion 
		int num1, num2, num3, sum;
		
		num1 = 4;
		num2 = 2;
		num3 = 3;
		sum = num1 + num2 + num3;
		
		//Outputting sum to user on screen
		System.out.println("4 plus 2 plus 3 is " + sum);
		//Alerting the user of the next step
		System.out.println("Now lets multiply those same numbers to find the product.");
		
		//Initialzing varbles for the multiplication
		int product;
		
		product = num1 * num2 * num3;
		
		//Outputting product to user on screen
		System.out.println("4 times 2 time 3 is " + product);
		System.out.println("Finally lets divide the sum by the product");
		
		//Initializing varibles for division
		int quotient;
		
		quotient = sum / product;
		
		//Outputtng quotient to user on screen
		System.out.println("The quotient is " + quotient); 
	}
}