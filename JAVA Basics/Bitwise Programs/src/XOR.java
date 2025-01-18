//Create a program that shows bitwise XOR of two Numbers.
import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        System.out.println("Enter the number");
        int b = input.nextInt();
        int c = a ^ b;
        System.out.println("The Bitwise OR of A and B is: " +c);
    }
}

//Example: OR (|)
// 1010
// 1011
// 0001 = 1

//TruthTable
// A B A^B
// 1 1  0
// 1 0  1
// 0 1  1
// 0 0  0