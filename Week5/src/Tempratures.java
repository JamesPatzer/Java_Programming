// Author: James D Patzer
// Date: 3/30/2026
// Description:
/* 
 * Request the user to input a month or enter year
 * It will then output the month and the average temperature for that month
 * If they selected year, it will display all the average, low, and high for each month
 * 
 * */
import java.util.Scanner;

public class Tempratures {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Arrays (temp and month) 
		// Stores the months 
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // Stores the numbers for average, low, and high
	    int[] temp =  {11, 14, 27, 42, 58, 68, 72, 70, 62, 47, 32, 17};
	    int[] low   = { 2,  4, 18, 32, 46, 57, 61, 58, 50, 37, 23,  9};
	    int[] high  = {20, 24, 37, 53, 69, 79, 83, 81, 73, 57, 40, 25};
	
		System.out.println("Please enter a month: ");
		String input = scanner.nextLine();
		
		// Test conditions
		if(input.equalsIgnoreCase("January")) {
			
			System.out.println("The monthly average for " + month[0] + " was " + temp[0] + " degrees.");
			
		} else if (input.equalsIgnoreCase("February")) {
			
			System.out.println("The monthly average for " + month[1] + " was " + temp[1] + " degrees.");
			
		} else if (input.equalsIgnoreCase("March")) {
			
			System.out.println("The monthly average for " + month[2] + " was " + temp[2] + " degrees.");
			
		} else if (input.equalsIgnoreCase("April")) {
			
			System.out.println("The monthly average for " + month[3] + " was " + temp[3] + " degrees.");
			
		} else if (input.equalsIgnoreCase("May")) {
			
			System.out.println("The monthly average for " + month[4] + " was " + temp[4] + " degrees.");
			
		} else if (input.equalsIgnoreCase("June")) {
			
			System.out.println("The monthly average for " + month[5] + " was " + temp[5] + " degrees.");
			
		} else if (input.equalsIgnoreCase("July")) {
			
			System.out.println("The monthly average for " + month[6] + " was " + temp[6] + " degrees.");
			
		} else if (input.equalsIgnoreCase("August")) {
			
			System.out.println("The monthly average for " + month[7] + " was " + temp[7] + " degrees.");
			
		} else if (input.equalsIgnoreCase("September")) {
			
			System.out.println("The monthly average for " + month[8] + " was " + temp[8] + " degrees.");
			
		} else if (input.equalsIgnoreCase("October")) {
			
			System.out.println("The monthly average for " + month[9] + " was " + temp[9] + " degrees.");
			
		} else if (input.equalsIgnoreCase("November")) {
			
			System.out.println("The monthly average for " + month[10] + " was " + temp[10] + " degrees.");
			
		} else if (input.equalsIgnoreCase("December")) {
			
			System.out.println("The monthly average for " + month[11] + " was " + temp[11] + " degrees.");
			
		} else if (input.equalsIgnoreCase("Year")) {
			
			for(int i = 0; i < 12; i++) {
				
				// Nice clean line beak. I could have used \n though
				System.out.println("");
				
				// Prints the average, low, and high temperatures
				System.out.println(month[i] + ":\n");
				System.out.println("Average temperature " + temp[i]);
				System.out.println("Lowest temperature " + low[i]);
				System.out.println("Highest temperature " + high[i]);
				
			}
		
		}
		
		scanner.close();
	}
}