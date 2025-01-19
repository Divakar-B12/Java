//Create a program to find given number is Even or Odd.
import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int remainder = n % 2;
        switch (remainder){
            case 0 :
                System.out.println("Given number is Even");
                break;
            case 1:
                System.out.println("Given number is Odd");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
