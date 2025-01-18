//Create a program that shows bitwise Compliment (NOT) of a Numbers.
import java.util.Scanner;

public class NOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int comp = ~n;
        System.out.println("The compliment of given number is "+comp);
    }
}

//EXAMPLE:
//n = 11;
//Binary --> 1011 = 11
//Output will be -12 because it will convert to 2's compliment form
//that convert like 111111111011 = -12