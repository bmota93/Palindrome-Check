/*=================================================================================

Name:          Brandon Mota

The program checks a user input to determine if the input is a palindrome

=================================================================================*/

import java.util.* ;
import java.io.*;

public class Palindrome {
	
	static String input ;	

	public static void main(String[] args) //used to control the flow of the program
	{
		System.out.println("This program will check to see if your input is a palindrome.");
		
		do //program will run at least once
		{
		userinput() ; //calls the userinput method
		
		if(input.length() != 1 && input.length()!=0) //if the length of the input is not 1 and not 0
		{
		Palindromequeue.queueadd(input) ; //calls the queue class
		Palindromestack.stackpush(input) ;	//calls the stack class	
		popdequeue() ; //calls another method
		
		}
		else if(input.length() == 1) //only applies if length is 1
		{
			System.out.println("\nA palindrome cannot be one character long.") ;
		}
		else //if everything else is not satisfied, then this will be displayed
		{
			System.out.println("\nYou need to enter something valid in order to check.") ;
		}
		
		System.out.print("\nWould you like to test more? (y or n) ---------> ") ;
		}
		while(restart()); //program would continue unless user types in "n"			
		
	}
	
	public static void userinput() //method will ask for user input and will enter it here
	{
		Scanner pal = new Scanner(System.in);
		
		System.out.print("Please enter a string you would like to check. ---------> ") ;
		
		input = pal.nextLine();	//input is stored by user input	
		input = input.replaceAll("\\W", ""); //all empty spaces and punctuation marks are removed
		input = input.toLowerCase() ; //the string is now set to lower case
	}
	
	public static void popdequeue() //method will pop and dequeue into separate variables
	{
		char letterstack = 0;
		char letterqueue = 0;
		
		System.out.println("\nChecking...") ; //will reassure user that program is working
		
		try
		{
		do
		{
			letterqueue = Palindromequeue.palqueue.remove();
			letterstack = Palindromestack.palstack.pop() ;
			
			if(!checker(letterstack, letterqueue)) //calls another method to check
			{
				break; //the loop will stop if terms are met			
			}
		}
		while (checker(letterstack, letterqueue)) ;	//will continue looping if terms are met	
		}
		catch (NoSuchElementException exception) //catches the exception "NoSuchElementException"
		{
			
		}
		
		if(!checker(letterstack, letterqueue)) //calls another method to check
		{
			System.out.println("Your input is NOT a palindrome.") ;
		}
		else
		{
			System.out.println("Your input is a palindrome.");
		}
	}
	
	public static boolean checker(char stack, char queue) //method will check variables to see if they are the same
	{
		if (stack == queue) //if the two variables are equal, then method will return true
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
	public static boolean restart() //method will check if user wants to continue
	{
		Scanner res = new Scanner(System.in);
		
		String check = res.nextLine() ;		
		
		if (check.equalsIgnoreCase("y")) // "y" input would return true
		{
			return true;
		}
		else if (check.equalsIgnoreCase("n")) // "n" input returns false and shuts down program
		{
			System.out.println("Program Terminated.") ;
			return false;
		}
		else //even if "n" or "y" are not inputed, program will shut down
		{
			System.out.println("\nYou needed to enter y or n. \nRestart the program if you did want to check another.") ;
			System.out.println("The program has been terminated.") ;
			return false ;		
		}
				
	}
	

}
