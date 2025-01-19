//Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;

public class sunOfTheDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int TotalSum = sunDigit(n);
        System.out.println("The sum of given digit is: "+TotalSum);

    }
    public static int sunDigit(int n){
        int sum = 0;
        int lastDigit;
        while(n>0){
            lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
}
