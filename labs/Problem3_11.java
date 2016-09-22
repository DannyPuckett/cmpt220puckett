/**
 * file: Problem3_11.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Problem3_11
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem3_11, this program was created to find
 *the number of days in a given month dependent on its year.
 */
import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem3_11 {  
  public static void main(String[] args) {  
  // Create a Scanner object 
  Scanner input = new Scanner(System.in);
  System.out.println(" This program has been built to compute the days in the specific month you have inquired,"); 
  System.out.println("Enter a digit for month: "); 
  int userMonth = input.nextInt();
  System.out.println("And now enter a digit for year: "); 
  int userYear = input.nextInt();
  
  
  switch (userMonth) { 
  case 1:  System.out.println("January" + userYear + "has/had 31 days"); 
  break; 
  case 2:  if ((userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0)){
	       System.out.println("Febuary " + userYear + " has/had 29 days"); 
           }else
			System.out.println("Febuary " + userYear + " has/had 28 days");   
  break; 
  case 3:  System.out.println("March " + userYear + " has/had 31 days"); 
  break; 
  case 4:  System.out.println("April " + userYear + " has/had 30 days"); 
  break; 
  case 5:  System.out.println("May " + userYear + " has/had 31 days"); 
  break; 
  case 6:  System.out.println("June " + userYear + " has/had 30 days"); 
  break; 
  case 7:  System.out.println("July " + userYear + " has/had 31 days"); 
  break; 
  case 8:  System.out.println("August " + userYear + " has/had 31 days"); 
  break; 
  case 9:  System.out.println("September " + userYear + " has/had 30 days"); 
  break; 
  case 10:  System.out.println("October " + userYear + " has/had 31 days"); 
  break; 
  case 11:  System.out.println("November " + userYear + " has/had 30 days"); 
  break; 
  case 12:  System.out.println("December " + userYear + " has/had 31 days"); 
  break; 
  default: System.out.println("Error: invalid status");           
  System.exit(1); }

  }  
} 
  




