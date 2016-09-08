  
  import java.util.Scanner; // Scanner is in the java.util package
  public class problem2_1 {  
    public static void main(String[] args) {  
     
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    
    // A simple clear screen for loop, to make output more presentable
       for (int k=0; k<30; k++)
       System.out.println();

    System.out.print("[Enter a degree in Celsius:] ");
    double celsius = input.nextDouble();
    double fahrenheit = ((9.0/5.0) * celsius + 32.0); 
    System.out.println("[And here are your conversion temperatures:] ");	
    System.out.println("You entered: " + celsius + "*C");
    System.out.println("Your fahrenheit conversion is: " + fahrenheit + "*F");
	
  }  
} 
  




