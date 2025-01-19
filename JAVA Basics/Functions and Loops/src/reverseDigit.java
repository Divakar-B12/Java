// Create a program to reverse the digits of a numbers.
import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int n = input.nextInt();
        int reverseNumberIs = reverse(n);
        System.out.println(reverseNumberIs);
    }
    public static int reverse(int n){
        int lastDigit;
        int Reverse = 0;
        while(n!=0){
            lastDigit = n % 10;
            Reverse = Reverse * 10 + lastDigit;
            n = n / 10;
        }
        return Reverse;
    }
}
