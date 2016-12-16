/**
 * file: Project_2.java
 * author: Danny Puckett
 * course: CMPT 220
 * assignment: Project_2
 * Due Date: Novenber, 8th, 2016
 * version: 1
 * 
 * this file contains Project_2, this program will have you input
 * a few details about yourself, by doing so you will alow the program to:
 * then create a password usable for you; with ideas behind it tailored 
 * for your protection and administration.
 * Some reasonable instructions on passwords will also be prided to better intstitute
 * your password uses and creation.
 */
import java.util.Scanner;

public class Project_2 {
  public static void main(String[] args) {
    int passwordLevel = 0;                                // used to create a password level
    String password = "Password";                       // used to store the final password
    int passwrdEncryptLevel = 0;                       // pretty sure i was going to use this, then didnt...
    boolean passwordPass = false;                      // bool for program check
    boolean passwordAcheive = false;                   // bool for password check
    String passAppend = "Yz";                           // portion of password created
    char spChar = 'Z';                                  // special char addition
    String hexPassword = password;                      // to convert to hex, didnt use...
    String hexAsciiPassword = "00 00 00 0F";            // as well
    int passwordLength = 0;                          //used to store what the ultimate passwords length should be
    int passwordLengthX = 0;                         // used to store what the users password length is in creation
    boolean alt = false;                              // reline flow of password create, from the choice branches
    String blockDesig = "Xy";                         // used for password creation
    
    Scanner input = new Scanner(System.in);                                // Create a Scanner 
    System.out.println("Enter your name; for password creation: ");        // Ask user forname
    System.out.println("Enter your name as follows: First name Last name");
    String userName = input.nextLine();                                    // Store users name
    System.out.println("Enter your age; for password level assessment: "); // Ask for users age
    System.out.println("Enter age as follows (01 - 99): ");                
    int userAge = input.nextInt();                                         // Store users age
    if (userAge < 16 || userAge > 65) 
     passwordLevel = 1;                                                    // Create a Password level of 1
    else if (userAge < 40) 
     passwordLevel = 3;                                                    // Create a Password level of 3
    else if (userAge < 65) 
     passwordLevel = 2;                                                    // Create a Password level of 2
    
    System.out.println("Password for: " + userName + ", " + userAge + " Years old");
    System.out.println("Will be created with the password level of:  " + passwordLevel);
    System.out.println("This is the level to which your password will be created!");
    System.out.println("The level is provided to give you a password suitable for you!");  
    System.out.println("--------------------------------------------------------------");  
    System.out.println("            ------------Password Processing----------         ");
    System.out.println("--------------------------------------------------------------");
    //passwordProcess (int passwordLevel, int );
    if ( passwordLevel == 1 ) {
      System.out.println("We would advise that at a password level of 1 you should:");
      System.out.println("- Use a password of 4 to 8 characters");
      System.out.println("- Use a password you can remember easily");
      System.out.println("- Have a simpiler password, for memory's sake");
      System.out.println("Enter the number of characters your password ought to be: ");
      System.out.println("Enter password length as follows (04 - 08): ");
      passwordLength = input.nextInt();
      passwordLengthX = passwordLength;
    } else if ( passwordLevel == 2 ) {
        System.out.println("We would advise that at a password level of 2 you should:");
        System.out.println("- Use a password of 8 to 14 characters");
        System.out.println("- Use a password you can remember fairly easily");
        System.out.println("- Have a moderate password, for memory's sake with security");
        System.out.println("Enter the number of characters your password ought to be: ");
        System.out.println("Enter password length as follows (08 - 14): ");
        passwordLength = input.nextInt();
        passwordLengthX = passwordLength;
    } else if ( passwordLevel == 3 ) {
        System.out.println("We would advise that at a password level of 3 you should:");
        System.out.println("- Use a password of 12 to 20 characters");
        System.out.println("- Use a password you can remember");
        System.out.println("- Have a semi-complex password, for security purpose");
        System.out.println("Enter the number of characters your password ought to be: ");
        System.out.println("Enter password length as follows (12 - 20): ");
        passwordLength = input.nextInt(); 
        passwordLengthX = passwordLength;
    }
    while(passwordPass == false){
      System.out.println("With your password level set we would now like to create your password!");
      System.out.println("The idea behind creating a password is security, yet being able to remember your password!");
      System.out.println("We will attempt to do both...");
      System.out.println("\n");
      System.out.println("We will begin by asking you a few quetions, for familiarity.");
      System.out.println("What is your favorite color?: ");
      String reject = input.next();
      System.out.println("What is your favorite animal?: ");
      String reject1 = input.next();
      System.out.println("What is your favorite sports team?: ");
      String reject2 = input.next();
      System.out.println("None of these will be used for your password! ");
      System.out.println("Sorry Bud! ");
      System.out.println("We will generate you a password that is Alpha-Numeric, ");
      System.out.println("Doing so will ensure your security! ");
      passwordPass = true;
      }   
      while(passwordAcheive == false){
        System.out.println("You have alotted your password to be: " + passwordLength + " characters...");
        System.out.println("Does your password require special characters or does Alpha-Numeric suffice?");
        System.out.println("Enter 1 if needing special characters... 0 if not needed!");
        int response = input.nextInt();
        if(response == 1){
          System.out.println("Select a special character: ");
          System.out.println(" 1: !   2: ?   3: #   4: $  5: %   6: &   7: (   8: )   9: [  10: ] ");
          System.out.println("11: +  12: -  13: *  14: / 15: _  16: =  17: <  18: >  19: .  20: @ ");
          System.out.println("Select a special character, to do so enter its index number: ");
          int specialChar = input.nextInt();
          switch (specialChar) { 
            case 1: spChar = '!'; alt = true; passwordLengthX--; break; 
            case 2: spChar = '?'; alt = true; passwordLengthX--; break;
            case 3: spChar = '#'; alt = true; passwordLengthX--; break;
            case 4: spChar = '$'; alt = true; passwordLengthX--; break;
            case 5: spChar = '%'; alt = true; passwordLengthX--; break;
            case 6: spChar = '&'; alt = true; passwordLengthX--; break;
            case 7: spChar = '('; alt = true; passwordLengthX--; break;
            case 8: spChar = ')'; alt = true; passwordLengthX--; break;
            case 9: spChar = '['; alt = true; passwordLengthX--; break;
            case 10: spChar = ']'; alt = true; passwordLengthX--; break;
            case 11: spChar = '+'; alt = true; passwordLengthX--; break;
            case 12: spChar = '-'; alt = true; passwordLengthX--; break;
            case 13: spChar = '*'; alt = true; passwordLengthX--; break;
            case 14: spChar = '/'; alt = true; passwordLengthX--; break;
            case 15: spChar = '_'; alt = true; passwordLengthX--; break;
            case 16: spChar = '='; alt = true; passwordLengthX--; break;
            case 17: spChar = '<'; alt = true; passwordLengthX--; break;
            case 18: spChar = '>'; alt = true; passwordLengthX--; break;
            case 19: spChar = '.'; alt = true; passwordLengthX--; break;
            case 20: spChar = '@'; alt = true; passwordLengthX--; break;
            }
          }  else if(response == 0){
             System.out.println("OK, Alpha-Numeric it will be!");
             
          }  else {passwordAcheive = false;}
           System.out.println("OK, Alpha-Numeric w/ a special character it will be!");
           passwordAcheive = true;
           System.out.println("OK, Lets get those other " + (passwordLength - 1) + " character set-up!" );
           
           if(passwordLengthX > 6){
            System.out.println("Select a block of 5 characters that you will easily recognize: ");
            System.out.println(" 1: aB7V3            2: aC5AI");
            System.out.println(" 3: aD7U3            4: aC5JI");
            System.out.println(" 5: aG7S3            6: aC5KI");
            System.out.println(" 7: aV7R3            8: aC5QI");
            System.out.println(" 9: aZ7Q3           10: aC5GI");
            System.out.println("Select by number designated, to do so enter its index number: ");
            int blockCh = input.nextInt();
            switch (blockCh) { 
              case 1: blockDesig = "aB7V3"; passwordLengthX = passwordLengthX - 5; break; 
              case 2: blockDesig = "aC5AI"; passwordLengthX = passwordLengthX - 5; break;
              case 3: blockDesig = "aD7U3"; passwordLengthX = passwordLengthX - 5; break;
              case 4: blockDesig = "aC5JI"; passwordLengthX = passwordLengthX - 5; break;
              case 5: blockDesig = "aG7S3"; passwordLengthX = passwordLengthX - 5; break;
              case 6: blockDesig = "aC5KI"; passwordLengthX = passwordLengthX - 5; break;
              case 7: blockDesig = "aV7R3"; passwordLengthX = passwordLengthX - 5; break;
              case 8: blockDesig = "aC5QI"; passwordLengthX = passwordLengthX - 5; break;
              case 9: blockDesig = "aZ7Q3"; passwordLengthX = passwordLengthX - 5; break;
              case 10: blockDesig = "aC5GI"; passwordLengthX = passwordLengthX - 5; break;
            }
          } 
          while (passwordLengthX != 0 && passAppend == "Yz"){
            System.out.println("Your currently " + (passwordLength - passwordLengthX) + " away from completion");
            System.out.println("Please select from the following to complete your new password: ");
            System.out.println("With a password length of " + passwordLength);
            System.out.println("You are " + passwordLengthX + " away from password completion");
            System.out.println("Enter the Number or Alpha characters you'd like to use:");
            System.out.println(" ");
            System.out.println("Keep in mind you have: " + passwordLengthX + " characters until completion");
            passAppend = input.next();
            passwordLengthX = (passwordLengthX - passAppend.length());
          }
          System.out.println("Your passwords length is: " + passwordLength);
          while (password == "Password"){
            password = (blockDesig + spChar + passAppend);
          }
          System.out.println("Mr./Mrs. " + userName + ", Here is your password: " + password);
          
                 
          
          
 /* initilize user information */ 
 // public static void initilizeUserInfo(String 5userName, Integer userAge) { 
 
 //}
  /* password processing */ 
 // public static void passwordProcess(String userName, Integer userAge) { 
 
 //}
    }
  }  
}
   