/**
 * file: Problem3_8.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Problem3_8
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem3_8, this program will ask you to input 3 numbers
 *the program will then find the non-decreasing order of your 3 numbers.
 */
import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem3_8 {  
  public static void main(String[] args) {  
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    System.out.println(" This program will ask you to input three individual digits,  "); 
    System.out.println(" The program will then figure the non-decreasing order of your three digits!  ");
    System.out.println("[Enter your first digit:] ");
    int userNumber1 = input.nextInt();
    System.out.println("[Enter your second digit:] ");
    int userNumber2 = input.nextInt();
    System.out.println("[Enter your third digit:] ");
    int userNumber3 = input.nextInt();
    if (userNumber1 >= userNumber2){
      if(userNumber1 >= userNumber3){
        if(userNumber2 >= userNumber3){
          System.out.println(userNumber3 + ", " + userNumber2 + ", " + userNumber1 + " [:These are your numbers in non-decreasing order] ");  
        }else
          System.out.println(userNumber2 + ", " + userNumber3 + ", " + userNumber1 + " [:These are your numbers in non-decreasing order] ");      
      }else
        System.out.println(userNumber2 + ", " + userNumber1 + ", " + userNumber3 + " [:These are your numbers in non-decreasing order] ");        
    }else
       if(userNumber2 >= userNumber3){
         if(userNumber1 >= userNumber3){
          System.out.println(userNumber3 + ", " + userNumber1 + ", " + userNumber2 + " [:These are your numbers in non-decreasing order] ");  
        }else
          System.out.println(userNumber1 + ", " + userNumber3 + ", " + userNumber2 + " [:These are your numbers in non-decreasing order] ");      
      }else
        System.out.println(userNumber1 + ", " + userNumber2 + ", " + userNumber3 + " [:These are your numbers in non-decreasing order] ");      
    
  }  
} 
  




