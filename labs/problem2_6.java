
  import java.util.Scanner; // Scanner is in the java.util package
  public class problem2_6 {  
    public static void main(String[] args) {  
     
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    
    // A simple clear screen for loop, to make output more presentable
       for (int k=0; k<30; k++)
       System.out.println();

    
	
		System.out.println("You will be instructed to enter a number in between 0 and 1000, ");
	    System.out.println("This number will be added 'digit for digit' and then processed and displayed,");
		System.out.println("Here is an example of what occurs: enter 999 ---> summation 9 + 9 + 9 = 27");
	
	System.out.print("[Enter a number between 0 and 1000:] ");
    
	int magicNumber1 = input.nextInt();
	int magicNumber=0;
	magicNumber = magicNumber1;
	if( 0 < magicNumber && 1000 > magicNumber ){
	int digitF = (magicNumber%10);
	magicNumber = magicNumber - digitF;
	int digitT = (magicNumber/100) ;
	magicNumber = magicNumber - (digitT * 100);
	int digitS = (magicNumber/10);
	magicNumber = magicNumber - (digitS*10);
	if (magicNumber==0)
		System.out.println("Proper function attained");
		
	
	int sumNum = (digitF + digitS + digitT);
	System.out.println("[Your number was: " + magicNumber1);
	System.out.println("the summation of the digits equate to:" + sumNum);
	}
	else{
	System.out.println("[Your number was outside of bounds... next time use a # between 0 and 1000!] ");
	}
	
	
	
	}
}
	
	
	