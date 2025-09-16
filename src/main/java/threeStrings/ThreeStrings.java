package threeStrings;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

public class ThreeStrings {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("First Print? ");
        String a = inp.nextLine();
        System.out.print("Second Print? ");
        String b = inp.nextLine();
        System.out.print("Third Print? ");
        String c = inp.nextLine();

        String ab = a + b;
        int x = ab.length();
        int y = c.length();
        
        if(x != y) {
            System.out.println(a + " + " + b +" is NOT equal to " + c);
        }
        else {
            System.out.println(a + " + " + b +" IS equal to " + c);
        }    

        
    }
}
