package loopsII_MathSeries;

import java.util.*;

public class MathSeries{
    public static void main(String []argh){
        
    	// initiate scanner class with system in method.
    	Scanner in = new Scanner(System.in);
    	// initate a,b,n
        int a = 0;
    	int b = 0;
    	int n = 0;
    	
        System.out.println("Give the values of a and b and n");
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
        in.close();

    System.out.println(series (a,b,n));
 }   	
 public static  double series(int a, int b, int n) {
	    double r = 0;
	    for (int x = 0; x<n; x++)
	    {
	 	   r = a+(2^x)*b;
	 	 //System.out.println(r);   
	    }
	    return r;
 }
}



