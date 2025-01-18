//Create a program that shows bitwise AND of two numbers.
import java.util.Scanner;

public class AND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        System.out.println("Enter the number");
        int b = input.nextInt();
        int c = a & b;
        System.out.println("The Bitwise AND of A and B is: " +c);
    }
}
//Example: AND (&)
// 1010
// 1011
// 1010 = 10

//TruthTable
// A B A&B
// 1 1  1
// 1 0  0
// 0 1  0
// 0 0  0