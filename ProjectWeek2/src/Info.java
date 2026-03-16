//Author: James D. Patzer [Don't know why my last name is underlined]
//Date: 3/12/2026
//Description: This program will ask you some questions and then it will output your responses

/* 
 * Pseudocode:
 * 
 * BEGIN
 * 
 * 	Ask user to input first name
 *  Ask user to input last name
 *  Ask user to input address 
 * 	Asks user to input city
 *  Asks user to zip code
 *  
 *  Add break to make the output cleaner 
 *  Create an output that states what the user input
 *  
 *  Output the input the user entered for the first name
 * 	Output the input the user entered for the last name
 * 	Output the input the user entered for the address
 *  Output the input the user entered for the city
 *  Output the input the user entered for the zip code
 *  
 *  END 
 *  
 *  You can also do it this way too:
 *  
 *  Pseudocode: 
 *  
 *  BEGIN
 *  
 *  Prompt: "Enter first name"
 *  Input: first_name
 *  
 *  Prompt: "Enter last name"
 *  Input: last_name
 *  
 *  Prompt: "Enter address"
 *  Input: address
 *  
 *  Prompt: "Enter city" 
 *  Input: city
 *  
 *  Prompt: "Enter zipcode"
 *  Input zipcode
 *  
 *  
 *  Output " " // Creates a line break 
 *  Output "Information Entered " // Notifies user what he/she entered
 *  
 *  Output "This is your first name: " + first_name
 *  Output "This is your last name: " + last_name
 *  Output "This is your address: " + address
 *  Output "This is your zip code: " + zipcode 
 *  
 *  END
 *  
 * 
 * */

//This is the import that is used to allows the scanner key word
import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		
				// Allows the user to input information 
				Scanner scanner = new Scanner(System.in);
				
				// Asks the user to input information 
				System.out.println("Enter your first name: ");
				String firstName = scanner.nextLine();
				
				System.out.println("What is your last name: ");
				String lastName = scanner.nextLine();
				
				System.out.println("Enter your street address: ");
				String address = scanner.nextLine();
				
				System.out.println("Enter you city: ");
				String city = scanner.nextLine();
				
				System.out.println("Enter you zip code: ");
				int code = scanner.nextInt();
				
				// Prints out the information above
				System.out.println("----- Here is the information you entered -----");
				System.out.println("");
				
				System.out.println("First name: " + firstName);
				System.out.println("Last name: " + lastName);
				System.out.println("Street address: " + address);
				System.out.println("City: " + city);
				System.out.println("Zip Code: " + code);

				// Prevents some errors from happening
				scanner.close();
	}

	
	
}