package loopsII_MathSeries;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
       
            for (int x=0; x<n-1;x++) {
            	System.out.print" "+series(a,b,n));
            }
        
        in.close();
        }
    }
    public static  double series(int a, int b, int n) { // used a method called series with input values as a,b,n and output as r.
	    double r = 0;
	    for (int x = 0; x<n; x++)
	    {
	 	   r = (double)a+(2^x)*b;
	 	 //System.out.println(r);   
	    }
	    return r;
 } 
}



