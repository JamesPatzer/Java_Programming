// Author: James D. Patzer
// Date: 3/17/2026 
// Finished: 3/19/2026
/** This program will do the following: 
 * 
 * Ask the user for a coupon discount (0 > < 100)
 * Ask for four weeks of groceries 
 * Calculate the average without the coupon 
 * Calculate the average with the coupon 
 * 
 *  **/ 
import java.util.Scanner;


public class FamilyBill {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// You can use a for loop to do this, but since I haven't learned it, I won't use one.
		
		// Coupon
		double coupon;
		
		
		// This is for the weekly bill
		double bill;
		double bill2;
		double bill3;
		double bill4;
		
		// Variable for the weekly average
		double formula;
		
		// Variable for the monthly average
		double monthlyFormula;

		// Variable for the percentage 
		double percentage;
		
		// Variable for the weekly average with the coupon
		double formulaCoupon;
		
		// Variable for the monthly average with the coupon
		double monthlyFormula2;
		
		// This is for the monthly bill
		double month;
		double month2;
		double month3;
		double month4;
		
		
		System.out.println("Please enter the discount of the coupon in %. ");
		coupon = scanner.nextDouble();
		
		System.out.println(" ");
		
		// This sets the value of the coupon to 10% if it is out of bounds
		if(coupon <= 0 || coupon >= 100) {
			
			// Statement to set the value equal to 10%
			coupon = 10;
			
		}
		
		// Weekly bill average prompts
		System.out.println("Pleas enter the first week's bill");
		bill = scanner.nextDouble();
		
		System.out.println("Pleas enter the second week's bill");
		bill2 = scanner.nextDouble();
		
		System.out.println("Pleas enter the third week's bill");
		bill3 = scanner.nextDouble();
		
		System.out.println("Pleas enter the fourth week's bill");
		bill4 = scanner.nextDouble();
		
		// Creates a nice empty space 
		System.out.println(" ");
		
		// Monthly bill average prompts
		System.out.println("Please enter the first month's bill");
		month = scanner.nextDouble();
		
		System.out.println("Please enter the second month's bill");
		month2 = scanner.nextDouble();
		
		System.out.println("Please enter the third month's bill");
		month3 = scanner.nextDouble();
		
		System.out.println("Please enter the fourth month's bill");
		month4 = scanner.nextDouble();
		
		// Empty space again
		System.out.println(" ");
		System.out.println("---Here are you results---");
		
		// This converts the number to a percent
		percentage = coupon/100;
		
		// This calculates the weekly bill average
		formula = (bill + bill2 + bill3 + bill4) / 4;
		
		// This calculates the monthly bill average
		monthlyFormula = (month + month2 + month3 + month4) / 4;
		
		// This displays the weekly bill average 
		System.out.println("This is your weekly grocery bill average without the coupon: " + formula);
		
		// This displays the monthly bill average 
		System.out.println("This is your monthly grocery bill average without the coupon: " + monthlyFormula);
		
		// This displays the weekly bill average with coupon
		formulaCoupon = formula - (percentage * formula);
		System.out.println("This is your weekly grocery bill average with coupon: " + formulaCoupon);
		
		
		// This displays the monthly bill average with coupon 
		monthlyFormula2 = monthlyFormula - (percentage * monthlyFormula);
		System.out.println("This is your monthly grocery bill average with coupon: " + monthlyFormula2);
		
		
		// Again, this is formal to close out the scanner once you use it.
		scanner.close();
	}

}