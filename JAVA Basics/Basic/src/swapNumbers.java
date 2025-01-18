// create a program to swap two numbers
import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        System.out.println("The number a and b Before Swap a="+a +" b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The number a and b After Swap a="+a +" b="+b);
    }
}
