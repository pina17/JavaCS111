

import java.util.Scanner;

public class MenuProgram
{
	public static final String NAME = "Ulises Jarrett Pina";
	public static final String COURSE = "CS 111 Intro to Java";
	public static final String SECTION = "TuTh 11:30am-3:20pm";
	
	public static void main(String[] args)
	{
		//DECLARATIONS
		String menuChoice;
		Scanner keyboard;
		
		int num1;
		double num2;
		double average;
		
		//INITIALIZATIONS
		keyboard = new Scanner (System.in);
		
			//welcome + intro
		MenuProgram.printHeader(6, "03/01/2015");
		
		//INPUT
		
		
		
		do
		{
		
		System.out.println("Please pick one of the three choices from the menu: ");
		System.out.println("A: Tell me a joke");
		System.out.println("B: Tell me average of an integer and a double");
		System.out.println("X: Exit program " + "\n");
		menuChoice = keyboard.nextLine();
		
			if((menuChoice.charAt(0) == 'A') || (menuChoice.charAt(0) == 'a'))
			{
				System.out.println("What's Pikachu's favourite treat?");
				System.out.println("Shock-o-chip cookies");
			}
			else if((menuChoice.charAt(0) == 'B') || (menuChoice.charAt(0) == 'b'))
			{
				num1 = readInt("Enter an integer between 0-100: ", keyboard, 0, 100);
				num2 = readDouble("Enter a double between 0.0-50.0: "
							 , keyboard, 0.0, 50.0);
				average = ((double)num1 + num2) / 2;
				System.out.println("The average of those two numbers is: " + average);
			}
			else if((menuChoice.charAt(0) == 'X') || (menuChoice.charAt(0) == 'x'))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Please enter a valid menu option");
			}
		
		}while((menuChoice.charAt(0) != 'C') || (menuChoice.charAt(0) != 'c'));

	}
	
	/*************************************************************************
	 * DESCRIPTION:		Print author information for start of program
	 * PRE-CONDITIONS:	All parameters are given a value
	 * POST-CONDITIONS:	Outputs author info to console
	 ************************************************************************/
	public static void printHeader(int homework, String lastModified) //CONVENTION: camelNotation
	{
		
		//output
		System.out.println("/********************************************");
		System.out.println("* AUTHOR:        " + NAME);
		System.out.println("* COURSE:        " + COURSE);
		System.out.println("* SECTION:       " + SECTION);
		System.out.println("* HOMEWORK #:    " + homework);
		System.out.println("* LAST MODIFIED: " + lastModified);
		System.out.println("********************************************/" + "\n");
	}

	/*****************************************************************************************
	* DESCRIPTION:    reads input from user, returns double value (error-checked using bounds)
	* PRECONDITIONS:  key is instantiated, prompt is in form "Enter...: ", lower < upper
	* POSTCONDITIONS: returns double value between lower and upper (inclusive)
	******************************************************************************************/
	public static int readInt(String prompt, Scanner key, int lower, int upper)
	{
		String temp;
		int num1;
		boolean isNotValid;
		
		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			num1 = Integer.parseInt(temp);
			isNotValid = (num1 < lower) || (num1 > upper);
			if(isNotValid)
			{
				System.out.println("ERROR: please enter value between " + lower + " - " + upper);
			}
		} while(isNotValid);
		
		return num1;
	}
	
	/*****************************************************************************************
	* DESCRIPTION:    reads input from user, returns double value (error-checked using bounds)
	* PRECONDITIONS:  key is instantiated, prompt is in form "Enter...: ", lower < upper
	* POSTCONDITIONS: returns double value between lower and upper (inclusive)
	******************************************************************************************/
	public static double readDouble(String prompt, Scanner key, double lower, double upper)
	{
		String temp;
		double num2;
		boolean isNotValid;
		
		do
		{
			System.out.print(prompt);
			temp = key.nextLine();
			num2 = Double.parseDouble(temp);
			isNotValid = (num2 < lower) || (num2 > upper);
			if(isNotValid)
			{
				System.out.println("ERROR: please enter value between " + lower + " - " + upper);
			}
		} while(isNotValid);
		
		return num2;
	
	}
}