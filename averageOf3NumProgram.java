/*************
 *Author: Ulises Pina
 *Course: CS 111 Intro to CS I
 *Section: Mon/Wed 11:10am
 *Homework #: Homework 2, Problem 1
 *Last Modified: 29 January 2014
 ************/
 
/***********
 *Finding Average Program
 ***********
 *Program Description:
 *This Progam will get three numbers from the user and find te average of the three numbers.
 ***********
 *Algorithm:
 *1)IMPORT the scanner class so it can read inputs
 *2)INITIALIZE the scanner class
 *3)DECLARE the varible
 *4)GREET the user 
 *5)BRIEF the user what the program will do
 *6)INITIALIZE the varbles for the scanner class
 *7)INITIALIZE the varible by creating an equation to find the average
 *8)OUTPUT the average of the numbers inputed by user
 **********/
 import java.util.Scanner;
 
 public class averageOf3NumProgram
 
 {
 	
 	public static void main (String[] args)
 	
 	{
 		Scanner keyboard = new Scanner(System.in);
 		
 		double average;
 		
 		System.out.println("\nWelcome to the program!");
 		System.out.println("Today I will calculate three whole numbers.");
 		System.out.println("Please enter the numbers at this moment.");
 		
 		double num1 = keyboard.nextInt();
 		double num2 = keyboard.nextInt();
 		double num3 = keyboard.nextInt();
 		keyboard.close();
 		
 		average = (num1 + num2 + num3) / 3;
 		
 		System.out.println("The average of the three numbers are " + average);
 		
 	}
 }