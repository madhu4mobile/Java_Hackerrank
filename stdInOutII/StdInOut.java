package stdInOutII;

import java.util.Scanner;

public class StdInOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();// goes to a fresh line before taking a string
        String s = scan.nextLine();
        // Write your code here.
        /*String a = scan.nextLine();
        String s = scan.next();
        Double d = scan.nextDouble();*/
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}