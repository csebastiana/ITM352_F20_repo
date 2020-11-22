/* Group 7
Presentation 1
ICS 111
Chavez & Terrance
*/

import java.util.Scanner;

class Question7
{
	public static void main(String[] args)
	{
		// Insertion of Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Prompting user to enter input
		System.out.print("Enter the first individuals' name: ");
		String name1 = keyboard.nextLine();
		System.out.print("Enter the second individuals' name: ");
		String name2 = keyboard.nextLine();
		
		// Printing of comparison values
		System.out.println("Name 1 = Name 2 is "+name1.equals(name2));
		System.out.println("Name 1 != Name 2 is "+!name1.equals(name2));
		
		// Compares strings to each other when using .equals
		
	} // End of main method
	
} // End of main class