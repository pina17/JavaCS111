/*************
 *Author: Ulises Pina
 *Course: CS 111 Intro to CS I
 *Section: Mon/Wed 11:10
 *Homework #: Homework 1, Problem 2
 *Last Modified: 27 January 2014
 ************/
 
/***********
 *Picture Program
 ***********
 *Program Description:
 *Creating a program that when it is ran it will create a picture in the command screen by
 *using simple characters found on the keyboard. 
 ***********
 *Algorithm:
 *1)TYPE "*" to create layers for the roof of house
 *2)TYPE two "*" with spaces in between to create walls of house by layers
 *3)TYPE "CS111" to create sign on house 
 *4)USE underscores, "|" and dashes to create two windows by latering them
 *5)USE "|", underscores and periods in layers to create a door for the house
 *6)OUTPUT it on command screen so it can look like a house
 **********/
 
public class SecondProgram3DPic
{
	public static void main (String[] args)
	{
		System.out.println("         *******************");
		System.out.println("        *********************");
		System.out.println("       ***********************");
		System.out.println("      ************************* ");
		System.out.println("       *  _ _   CS111   _ _  *");
		System.out.println("       * | | |         | | | *");
		System.out.println("       *  - -           - -  *");
		System.out.println("       *                     *");
		System.out.println("       *        __ __        *");
		System.out.println("       *        |.|.|        *");
		System.out.println("       *        | | |        *");
	}
}