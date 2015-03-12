/*************
 *Author: Ulises Pina
 *Course: CS 111 Intro to CS I
 *Section: Mon/Wed 11:10am
 *Homework #: Homework 2, Problem 2
 *Last Modified: 29 January 2015
 ************/
 
/***********
 * METcaloriesProgram
 ***********
 *Program Description:
 *This program is meant to calculate the total amount of calories burned by two different people with different weight
 *doing three activities and both of them have the same amount of time for each activitie. 
 ***********
 *Algorithm:
 *1)DECLARE constants: METS_RUN, METS_BALL, METS_SLEEP, PERSON_1KG, PERSON_2KG.
 *2)DECLARE varibles as doubles: caloriesRun1, caloriesSleep1, caloriesBall1, person_150lb
 * caloriesRun2, caloriesSleep2, caloriesBall2, person_250lb
 *3)CALCULATE the amount of calories bburnt by each action with equation: calories = 0.0175 * METS * Weight in Kg * Minutes 
 *4)CALCULATE the total number of calories by adding each action together.
 *5)REPEAT step 3 and 4 for the second person.
 *6)GREET the user to the program. 
 *7)EXPLAIN the purpose of the program.
 *8)OUTPUT the amount of clories for person one
 *9)OUTPUT the amount of claories for person two.
 **********/
 
 import java.util.Scanner;
 
 public class metCaloriesProgram
 
 {	
 	public static final double METS_RUN = 10;
 	public static final double METS_BALL = 8;
 	public static final double METS_SLEEP = 1;
 	
 	public static void main (String[] args)
 	
 	{
 			
 			double caloriesRun1;
 			double caloriesBall1;
 			double caloriesSleep1;
 			double person_150lb;
 			
 			double caloriesRun2;
 			double caloriesBall2;
 			double caloriesSleep2;
 			double person_250lb;
 			
 			
 			
 			Scanner keyboard = new Scanner(System.in);
 			
 			System.out.println("\nWelcome User!");
 			System.out.println("Today we will be calculating the weight of two people with different weight.");
 			System.out.println("They both do the same amount of basketball, running at 6MPH and sleep. \n");
 			System.out.println("Both of them play basketball for 30mins, run for 30mins and sleep for 6 hours. \n");
 			System.out.println("PLease enter the first weight in pounds. ");
 			
 			double weightInKg1 = keyboard.nextDouble () / 2.2;
 			caloriesRun1 = 0.0175 * METS_RUN * weightInKg1 * 30;
 			caloriesBall1 = 0.0175 * METS_BALL * weightInKg1 * 30;
 			caloriesSleep1 = 0.0175 * METS_SLEEP * weightInKg1 * 360;
 			person_150lb = caloriesRun1 + caloriesBall1 + caloriesSleep1;
 			
 			System.out.println("PLease enter the second weight in pounds.");
 			
 			double weightInKg2 = keyboard.nextDouble () / 2.2;
 			caloriesRun2 = 0.0175 * METS_RUN * weightInKg2 * 30;
 			caloriesBall2 = 0.0175 * METS_BALL * weightInKg2 * 30;
 			caloriesSleep2 = 0.0175 * METS_SLEEP * weightInKg2 * 360;
 			person_250lb = caloriesRun2 + caloriesBall2 + caloriesSleep2;
 			keyboard.close();
 			
 			System.out.println("The first person weighs 150lbs and burns a total of " + person_150lb + " calories.");
 			System.out.println("The second person weighs 250lbs and burns a total of " + person_250lb + " calories.");
 			;
 	}
 }