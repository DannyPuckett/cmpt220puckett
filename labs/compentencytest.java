// == missing header

// == incorrect indentation
  import java.util.Scanner; // Scanner is in the java.util package
  public class compentencytest {  
    public static void main(String[] args) {  
     
    // Create a Scanner object 
    Scanner input = new Scanner(System.in);
    
    // A simple clear screen for loop, to make output more presentable
       for (int k=0; k<30; k++)
       System.out.println();

    
	
		
	
// == using tabs!!
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
	
	System.out.println("   Midterm Exam:   " + midterm);
	System.out.println("   Final Exam:     " + fin);
	System.out.println("    Projects:      " + projects);
	System.out.println("Homework and Labs: " + hwLbs);
    System.out.println("Your Final Grade Has Been Calculated At: " + finGrade + "%");
	
	}
}
	
	
	
