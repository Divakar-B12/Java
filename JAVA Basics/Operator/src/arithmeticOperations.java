import java.util.Scanner;

// Create a program that takes two numbers and shows results of all arithmetic operations(+,-,*,/,%).
public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        System.out.println("Addition of "+a +" and " +b +" are: "+(a+b));
        System.out.println("Subtraction of "+a +" and " +b +" are: "+(a-b));
        System.out.println("Multiplication of "+a +" and " +b +" are: "+(a*b));
        System.out.println("Division of "+a +" and " +b +" are: "+(a/b));
        System.out.println("Modulus of "+a +" and " +b +" are: "+(a%b));
    }
}
