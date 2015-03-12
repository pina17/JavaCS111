/**
 *Chapter No.1 Exercise No.3
 *File Name: Project3.java
 *Programmer: Ulises Pina
 *Date Last Modified: September 6, 2014
 */
 
 //Problem Statement: Write a program that reads in three whole numbers and outputs the average of the three numbers.
 
 /*Overall Plan: 
  *1)Pick three numbers to find the average of
  *2)Use double to set the average of the nubers picked
  *3)Print average on the screen
  */
 
 import java.util.*;
public class Project3 
{
    
    public static void main(String[] args) 
    {
        System.out.println("I will find the average of the following three numbers: 7, 8, 5 \n");
        double average1 = ((7.0 * 8.0 * 5.0) / 3.0);
        System.out.println("The average is:");
        System.out.printf("%.2f\n", average1);
    }
}
