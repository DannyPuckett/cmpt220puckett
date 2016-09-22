import java.util.Scanner; // Scanner is in the java.util package  
 
public class Problem4_15 {  
  public static void main(String[] args) {  
  // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    System.out.print("This program will ask you for a "); 
    System.out.println("character on the keypad of a phone"); 
    System.out.print("You will then enter a "); 
    System.out.println("character on the keypad of a phone");
    System.out.println("Enter a character on the keypad of a phone: ");
    String s = input.nextLine(); 
    char keypadChar =  s.charAt(0);
    if(keypadChar == 'a' || keypadChar == 'A' || 
       keypadChar == 'b' || keypadChar == 'B' || 
       keypadChar == 'c' || keypadChar == 'C'){
    System.out.println("The digit of 2 is where " + keypadChar + " is placed");
    }else if(keypadChar == 'd' || keypadChar == 'D' || 
             keypadChar == 'e' || keypadChar == 'E' || 
             keypadChar == 'f' || keypadChar == 'F'){
       System.out.println("The digit of 3 is where " + keypadChar + " is placed");
    }else if(keypadChar == 'g' || keypadChar == 'G' || 
             keypadChar == 'h' || keypadChar == 'H' || 
             keypadChar == 'i' || keypadChar == 'I'){
       System.out.println("The digit of 4 is where " + keypadChar + " is placed");
    }else if(keypadChar == 'j' || keypadChar == 'J' || 
             keypadChar == 'k' || keypadChar == 'K' || 
             keypadChar == 'l' || keypadChar == 'L'){
       System.out.println("The digit of 5 is where " + keypadChar + " is placed");
    }else if(keypadChar == 'm' || keypadChar == 'M' || 
             keypadChar == 'n' || keypadChar == 'N' || 
             keypadChar == 'o' || keypadChar == 'O'){
       System.out.println("The digit of 6 is where " + keypadChar + " is placed");
    }else if(keypadChar == 'p' || keypadChar == 'P' || 
             keypadChar == 'q' || keypadChar == 'Q' || 
             keypadChar == 'r' || keypadChar == 'R' || 
             keypadChar == 's' || keypadChar == 'S'){
       System.out.println("The digit of 7 is where " + keypadChar + " is placed");
    }else if(keypadChar == 't' || keypadChar == 'T' || 
             keypadChar == 'u' || keypadChar == 'U' || 
             keypadChar == 'v' || keypadChar == 'V'){
       System.out.println("The digit of 8 is where" + keypadChar + " is placed");
    }else if(keypadChar == 'w' || keypadChar == 'W' || 
             keypadChar == 'x' || keypadChar == 'X' || 
             keypadChar == 'y' || keypadChar == 'Y' || 
             keypadChar == 'z' || keypadChar == 'Z'){
       System.out.println("The digit of 9 is where" + keypadChar + " is placed");
    }else
       System.out.println("Enter a valid character next time... ");
  }  
} 
  




