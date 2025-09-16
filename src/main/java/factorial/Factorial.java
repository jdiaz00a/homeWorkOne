package factorial;
/*
Write a program that prints a factorial to the screen.

The factorial of a number is found by multiplying itself by all positive integers less than it (excluding 0). For example, 4 factorial, written as 4!, can be computed as follows:

4! == 4 * 3 * 2 * 1 == 24
After taking user input for the factorial they want to find, print out the factorial to the console.
Remember to use a for loop! Java does not have a built in factorial operator.
Example Output:
What number would you like to compute the factorial for? 4
24
*/

import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("What number would you like to compute the factorial for? ");
        int x = inp.nextInt();
        int y = 1;
        
        for(int i = 1;i <= x;i++) {
            y *= i;
        }    
        
        System.out.println(y);
    }
}
