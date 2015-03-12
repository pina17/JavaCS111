/*************
 *Author: Ulises Pina
 *Course: CS 111 Intro to CS I
 *Section: Mon/Wed 11:10am
 *Homework #: Homework 2, Problem 3
 *Last Modified: 30 January 2014
 ************/
 
/***********
 *Temperature Coverstion Program
 ***********
 *Program Description:
 *This Program will convert degrees Fahrenheit to degrees Celsius.
 ***********
 *Algorithm:
 *1)IMPORT the scanner class so it can read inputs
 *2)INITIALIZE the scanner class
 *3)DECLARE the varible
 *4)GREET the user 
 *5)BRIEF the user what the program will do
 *6)INITIALIZE the varbles for the scanner class
 *7)INITIALIZE the varible by creating an equation to convert into Celsius
 *8)OUTPUT the converted tempersture
 **********/ 
 
 import java.util.Scanner;
 
 public class temperatureConvertionProgram
 
 {
 	public static void main (String[] args)
 	
 	{
 		Scanner keyboard = new Scanner(System.in);
 		
 		double tempCel;
 		
 		System.out.println("Welcome to the Tempreture Converstion Program!");
 		System.out.println("This program converts degrees Fahrenheit to degrees Celsius.");
 		System.out.println("Try it out put any degree in Fahrenheit.");	
 		
 		double tempFer = keyboard.nextInt();
 		keyboard.close();
 		
 		tempCel = 5 * (tempFer - 32) / 9;
 		
 		System.out.println("The new tempreature is " + tempCel + " degrees");
 	}
 }