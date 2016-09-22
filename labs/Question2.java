/**
 * file: Question2.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Question 2
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contain Question 2his will calculate a letter grade based on your 
 *midterm, final exam, project, homework and lab grades
 */
import java.util.Scanner; // Scanner is in the java.util package
public class Question2 {  
  public static void main(String[] args) {  
// Create a Scanner object 
    Scanner input = new Scanner(System.in);
    System.out.println("Let's Calculate Your Class Average... ");
    System.out.println("[Enter your midterm exam grade:] ");
    double midterm = input.nextDouble();
    System.out.println("[Enter your final exam grade:] ");
    double fin = input.nextDouble();
    System.out.println("[Enter your projects grade:] ");
    double projects = input.nextDouble();
    System.out.println("[Enter your homework and labs grade:] ");
    double hwLbs = input.nextDouble();
    double finGrade = ((midterm*.2) + (fin*.2) + (projects*.2) + (hwLbs*.4));
    char letterGrade;
    if (finGrade >= 90.0)  letterGrade = ('A'); 
    else if (finGrade >= 80.0)  letterGrade = ('B'); 
    else if (finGrade >= 70.0)  letterGrade = ('C'); 
    else if (finGrade >= 60.0)  letterGrade = ('D'); 
    else  letterGrade = ('F');
    System.out.println("   Midterm Exam:   " + midterm);
    System.out.println("   Final Exam:     " + fin);
    System.out.println("    Projects:      " + projects);
    System.out.println("Homework and Labs: " + hwLbs);
    System.out.println("Your Final Grade Has Been Calculated At: " + finGrade + "%" + " Letter:" + letterGrade);
  }
}
 
 
 