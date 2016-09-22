/**
 * file: Problem3_4.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Problem3_4
 * due date: September 15, 2016
 * version: 1.5
 * 
 *this file contains problem3_4, this program will create a random number
 *between 1 and 12 and then give you the month of that number.
 */

public class Problem3_4 {  
  public static void main(String[] args) {  
  int number1 = (int)(Math.random() * 12);  
  if (number1 < 7) { 
    if (number1<4){
      if(number1==1){
        System.out.println("Your random number was: " + number1 + " And your month is: January");
      }else if(number1==2){
        System.out.println("Your random number was: " + number1 + " And your month is: Febuary");
      }else if(number1==3){
        System.out.println("Your random number was: " + number1 + " And your month is: March");
      }else if(number1>4 && number1<7){
        if(number1==4){
          System.out.println("Your random number was: " + number1 + " And your month is: April");
        }else if(number1==5){
          System.out.println("Your random number was: " + number1 + " And your month is: May");
        }else if(number1==6){
          System.out.println("Your random number was: " + number1 + " And your month is: June");
        }
      }
    }
  }else if (number1 >= 7) { 
    if (number1<10){
      if(number1==7){
        System.out.println("Your random number was: " + number1 + " And your month is: July");
      }else if(number1==8){
        System.out.println("Your random number was: " + number1 + " And your month is: August");
      }else if(number1==9){
        System.out.println("Your random number was: " + number1 + " And your month is: September");
      }else if(number1>9 && number1<13){
        if(number1==10){
          System.out.println("Your random number was: " + number1 + " And your month is: October");
        }else{
           if(number1==11){
           System.out.println("Your random number was: " + number1 + " And your month is: November");
           }else
              if(number1==12) {
              System.out.println("Your random number was: " + number1 + " And your month is: December");
              }
          }
       }
     }  
   }
  }
}
  




