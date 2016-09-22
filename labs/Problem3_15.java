/**
 * file: Problem3_15.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Problem3_15
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem3_15, this program was created to mimic
 *a lottery of three numbers. the problem asks us to update the code
 *with a sumission of Y or N, instead of 1 or 0!
 */
 import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem3_15 {  
  public static void main(String[] args) {  
  // Create a Scanner object 
  Scanner input = new Scanner(System.in);
  System.out.println("This program has been built to perform a lottery of three digits"); 
  System.out.println("If all three numbers directly match, you win $10,000"); 
  System.out.println("If all three numbers indirectly match, you win $3,000"); 
  System.out.println("If one of your numbers indirectly match, you win $1,000"); 
  System.out.println("Enter your Three digit number: "); 
  int userNumber = input.nextInt();
  int lotteryNumber = (int)(Math.random() * 999); 
  int matchStatus;
  int userNumber1 = userNumber / 100;  
  int userNumber2 = userNumber / 10 - (userNumber1 * 10); 
  int userNumber3 = userNumber % 10;
  int lotteryNumber1 = lotteryNumber / 100;  
  int lotteryNumber2 = lotteryNumber / 10 - (lotteryNumber1 * 10); 
  int lotteryNumber3 = lotteryNumber % 10;
  
  
  if(userNumber == lotteryNumber){
 matchStatus=1;  
  }else if((userNumber1 == lotteryNumber1) || (userNumber1 == lotteryNumber2) || (userNumber3 == lotteryNumber3) 
        && (userNumber2 == lotteryNumber1) || (userNumber2 == lotteryNumber2) || (userNumber3 == lotteryNumber3) 
        && (userNumber3 == lotteryNumber1) || (userNumber3 == lotteryNumber2) || (userNumber3 == lotteryNumber3)){
          matchStatus = 2;
  }else if((userNumber1 == lotteryNumber2 || userNumber1 == lotteryNumber3) 
        || (userNumber2 == lotteryNumber1 || userNumber2 == lotteryNumber3) 
        || (userNumber3 == lotteryNumber1 || userNumber3 == lotteryNumber2)){
          matchStatus = 3;
  }else
          matchStatus = 4;
 
  
  switch (matchStatus) { 
  case 1: System.out.println("You win $10,000 " + userNumber + " directly matches " + lotteryNumber + " :Lottery Number");     
  break; 
  case 2: System.out.println("You win $3,000 " + userNumber + " indirectly matches all 3 digits of " + lotteryNumber + " :Lottery Number");   
  break; 
  case 3: System.out.println("You win $1,000 " + userNumber + " indirectly matches one digit of " + lotteryNumber + " :Lottery Number");    
  break; 
  case 4: System.out.println("You haven't won! " + userNumber + " doesn't match " + lotteryNumber + " directly or indirectly");  
  break; 
  default: System.out.println("Error: invalid status");           
  System.exit(1); }

  }  
} 
  




