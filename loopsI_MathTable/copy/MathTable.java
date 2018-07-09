package loopsI_MathTable.copy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MathTable {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        //my code
        for (int i = 1; i<=20; i++ )
        {
        	//System.out.printf("%d x%3d = %-3s\n",N,i,i*N); -- using full formats
        	System.out.println(N+" x "+i+" = "+i*N);  // with out farmatting.
        }
        
    }
}