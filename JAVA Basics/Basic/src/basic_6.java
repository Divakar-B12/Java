//6. Create a program to add two numbers by taking your input.
import java.util.Scanner;
public class basic_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = input.nextInt();
        System.out.println("Enter the second number");
        int m = input.nextInt();
        int add = n + m;
        System.out.println("The addition of given two numbers are: "+add);
    }
}
