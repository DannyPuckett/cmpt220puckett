
/**
 * file: Problem4_1.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Problem4_1
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem4_1, this program will calculate
 *the area of any pentagon
 */
 import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem4_1 {  
  public static void main(String[] args) {  
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    System.out.println(" This program will ask you for the measurements of your pentagon, "); 
    System.out.println(" The program will then figure the area of your created pentagon ");
    System.out.println("[Enter the radius for your pentagon: ]");
    double radius = input.nextDouble();
    double side = (2 * (radius)) * (Math.sin(Math.PI/5));
    double area = (5 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI/5)));
    System.out.printf("Your Area is %4.2f",  area);
    System.out.println(" ");
    System.out.printf("While having a side size of: %4.2f",  side);
    System.out.println(" ");
    System.out.printf("While having a radius of: %4.2f",  radius);
    System.out.println(" ");
  }  
} 
  


