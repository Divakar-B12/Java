//Create a program to perform Arithmetic operation.
import java.util.Scanner;

public class arithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Enter the Operator");
        char operator = input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("The Addition of given two number is: "+(a+b));
                break;
            case '-':
                System.out.println("The Subtraction of given two number is: "+(a-b));
                break;
            case '*':
                System.out.println("The Multiplication of given two number is: "+(a*b));
                break;
            case '/':
                System.out.println("The Division of given two number is: "+(a/b));
                break;
            case '%':
                System.out.println("The Modulus of given two number is: "+(a%b));
                break;
            default:
                System.out.println("Given Invalid operator,please Check and give valid Operator.");

        }
    }
}
