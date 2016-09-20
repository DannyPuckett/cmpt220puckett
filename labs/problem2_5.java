// == missing header
// == incorrect indentation
  import java.util.Scanner; // Scanner is in the java.util package
  public class problem2_5 {  
    public static void main(String[] args) {  
     
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    
    // A simple clear screen for loop, to make output more presentable
       for (int k=0; k<30; k++)
       System.out.println();

    
	
// == you are using tabs!!
		System.out.println("This program is best utilized as a tip calculator and total summator! ");
	    System.out.println("To do so enter a subtotal when prompted, and a gratuity rate when also prompted... ");
	
	System.out.print("[Enter a subtotal:] ");
    double subtotal = input.nextDouble();
	System.out.print("[Enter a gratuity rate:] ");
    double gratuity = input.nextDouble();
    double tip = (subtotal * (gratuity / 100.0));
    //System.out.print("%5.2d", tip); [chat on it to figure it out another day...]
    double total = (subtotal + tip);
	//System.out.print("%5.2d", total); [chat on it to figure it out another day...]
	System.out.println("This has been calculated from a subtotal of: $" + subtotal);
	System.out.println("And a gratuity rate of: " + gratuity + "%");
	System.out.println("Your tip amount has been calculated at:      $" + tip);
	System.out.println("_______________________________________________________");
	System.out.println("Your total amount has been calculated at: $" + total);
  }  
} 
  




