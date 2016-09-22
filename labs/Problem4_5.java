/**
 * file: Problem4_5.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Problem4_5
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem4_5, this program will calculate
 *the area of any polygon
 */
import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem4_5 {  
  public static void main(String[] args) {  
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    System.out.println(" This program will ask you for the measurements of your polygon, "); 
    System.out.println(" The program will then figure the area of your created polygon ");
    System.out.println("[Enter the number of sides for your polygon: ]");
    double numberSides = input.nextDouble();
    System.out.println("[Enter the measure of the sides for your polygon: ]");
    double sideSize = input.nextDouble();
    double area = (numberSides * (Math.pow(sideSize, 2))) / (4 * (Math.tan(Math.PI/numberSides)));
    System.out.printf("Your Area is %4.2f",  area);
    System.out.println(" ");
    System.out.printf("While having a side size of: %4.2f",  sideSize);
    System.out.println(" ");
    System.out.printf("While having " + numberSides + " sides!");
    System.out.println(" ");
  }  
} 
  




