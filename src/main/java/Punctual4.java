import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Punctual4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int n = in.nextInt();
        int sum = 0,r;
        int temp = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)
            System.out.println("It's a Palindrome.");
        else
            System.out.println("Not a palindrome");
    }
}

