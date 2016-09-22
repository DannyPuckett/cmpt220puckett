/**
 * file: Problem4_8.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: project 0
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem4_8, this program asks for a ascii code
 *then it will convert it to its character value
 */
 import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem4_8 {  
  public static void main(String[] args) {  
  // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    System.out.println(" This program will ask you to input an ascii code, "); 
    System.out.println(" The program will then covert the ascii codeinto it's proper character!");
    System.out.println("[Enter the ASCII code you'd like to use: ]");
    int ascii = input.nextInt();
    System.out.println("[Enter the measure of the sides for your polygon: ]");
    if(ascii <=127 && ascii >=0){
    char x = (char)ascii;
    System.out.println("From your ascii code of: " + ascii);
    System.out.println("Your character is: " + x);
    }else
    System.out.println("Undeterminable digit for ASCII interpretation! ");
  }  
} 
  




