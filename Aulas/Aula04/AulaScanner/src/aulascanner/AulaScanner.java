package aulascanner;

import java.util.Scanner;

public class AulaScanner {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Give me a number: ");
        int numb1 = scan.nextInt();
        
        System.out.print("Other number: ");
        int numb2 = scan.nextInt();
        
        int res = numb1 + numb2;
        
        System.out.printf("The result of sum: %d", res);
        
    }
    
}
