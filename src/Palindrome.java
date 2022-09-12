/**
 * @author Michael Elder
 * 	Assignment 2.2 Coding a Stack to Test for Palindrome
 *  The palindrome class creates a scanner that asks for a string from the user and then pushes all the 
 *  characters of the string into the stack. 
 */
import java.util.Stack;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		/**
		 * Printing "Enter a String" to the user
		 */
		System.out.println("Enter a string: ");
		
		/**
		 * Creating the scanner
		 */
		Scanner scan = new Scanner(System.in);
		
		/**
		 * Creating a string variable str1 and saving the user's input to the variable
		 */
		String str1 = scan.nextLine();
		
		/**
		 * Creating a stack called stack
		 */
		Stack<Character> stack = new Stack<Character>();
		
		/**
		 * The for loop adds all of the characters of the string to the stack
		 */
		for (int count = 0; count < str1.length(); count++) {
			stack.push(str1.charAt(count));
		}//end for loop
		
		/**
		 * Creates a string called palindrome
		 */
		String palindrome = "";
		
		/**
		 * This method removes the characters of the string in the opposite order that they were placed in
		 * and saves each character and puts it into the palindrome variable 
		 */
		while(!stack.isEmpty()) {
			palindrome += stack.pop();
		}//end !stack.isEmpty method
		
		/**
		 * If statement that compares the str1 to the reverse to see if it is a palindrome.
		 */
		if(str1.equals(palindrome)) 
			System.out.println("The string " + str1 + " is a palindrome.");
		else
			System.out.println("The string " + str1 + " is not a palindrome.");
		System.out.println("\n");
		System.out.println("The string: " + str1);
		System.out.println("The string in reverse: " + palindrome);
		/**
		 * Closing the scanner
		 */
		scan.close();//closing the scanner
	}//end main

}//end class
