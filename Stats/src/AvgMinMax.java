// Author: James Patzer
// Date: 3/22/2026
// Description: This program will input 10 grades (from a user) and display average, high, and low scores.
// DISCLAIMER: I did use AI to help me fix a couple of errors. I had no idea what they were.

import java.util.Scanner;

public class AvgMinMax {

    public static void main(String[] args) {
        
    	// Scanner
        Scanner scanner = new Scanner(System.in);
        
        double[] values = new double[10];
        
        int grade;
        int max = -1;  
        int min = 101;         
        double sum = 0;
        
        
        // Easy for loop
        for(int i = 0; i < values.length; i++) {
            
            System.out.println("Please enter " + (10 - i) + " grades");
            
            // Makes sure the input is within bounds
            do {
            	
            	// Input statement
                grade = scanner.nextInt();   
                
                if (grade <= 0) {
                	
                    System.out.println("Please enter a grade above 0!");
                    System.out.println("Try again!");
                    
                } else if (grade >= 101) {
                	
                    System.out.println("Please enter a grade less than or equal to 100!");
                    System.out.println("Try again!");
                    
                }
                
            } while (grade <= 0 || grade >= 101);
            
            values[i] = grade;
            sum += grade;
            
            // Finds the min
            if (grade < min) {
                min = grade;
            }
            
            // Finds the max
            if (grade > max) {
                max = grade;
            }
        }
        
        // Outputs the average, min, and max
        System.out.println(" ");
        System.out.println("-----Here are the results-----");
        System.out.println("This is the average of the scores: " + sum/10);
        System.out.println("This is the lowest grade: " + min + ".");
        System.out.println("This is the highest grade: " + max + ".");
        
        // Closing the scanner
        scanner.close();
    }

}