package Methods_Practice;

import java.util.Scanner;

public class SmallestWithMethods {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  System.out.print ("input the first number : ");
		  double x = in.nextDouble();
		  System.out.print ("input the second number : ");
		  double y = in.nextDouble();
		  System.out.print ("input the third number : ");
		  double z = in.nextDouble();
		  
		  System.out.print("The smallest value is "+smallest(x,y,z)+"\n" );  // this calls the method smallest and returns the small value as a result.
		  
	}
	public static double smallest(double x, double y, double z) {
	    if (x<y && x<z) {
	      return x;
	    } else if (y<z) {
	      return y;
	    } else {
	      return z;
	    }
	  }

}
