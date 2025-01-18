// create a program to calculate product of two floating points numbers.
import java.util.Scanner;

public class product_of_floating_values {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the float number");
        float a = input.nextFloat();
        System.out.println("Enter the second float number");
        float b = input.nextFloat();
        System.out.println("The product of given values is: "+(a*b));
    }
}
