package divisibility;

//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.
//
// For example, one run of the program may look like this:
//
//Enter the dividend: 10
//Enter the divisor: 5
//10 is divisible by 5!
//
//Because 5 goes into 10 twice. 10 is evenly divisible by 5.

//Your program should be able to produce the following output:
//
//Enter the dividend: 10
//Enter the divisor: 0
//10 is not divisible by 0

import java.util.*;

public class Divisibility {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the divider: ");
        int x = inp.nextInt();
        System.out.print("Enter the dividor: ");
        int y = inp.nextInt();

        if (y == 0) {
            System.out.print(x + " is NOT divisible by 0");
        }
        else {
            int z = x/y;
            
            if (x % y == 0) {
                System.out.println(x + " is divisible by " + y + "\nBecause " + y + " goes into " + x + " -> " + z + " times. " + x + " is evenly divisible by " + y); 
            }   
            else {
                System.out.println(x + " is NOT divisible by " + y);
            }    
        }
    }
}
