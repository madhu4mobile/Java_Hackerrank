package loopsII_MathSeries;

import java.util.Scanner;

public class MathSeries_secondAttempt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        	
            int term = 0;  // initiate term with zero
            for (int s=0; s<n;s++) {
            	System.out.println("Value of s is "+s);
            
            	for (int j=1;j<1(s+1);j++) {
            		System.out.println("Value of j is "+j);
            		System.out.println("Value of s+1 is "+(s+1));
            		term =+ (a+((2^s)*b));
            		System.out.println("Value of term is "+term);
            	}
            	//System.out.println(term+" .");
            }
        
        in.close();
        }
    }
}
