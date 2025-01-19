//Create a program to verify if a number ia a palindrome.
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        boolean isPalindrome =  isPalindrome(n);
        if (isPalindrome){
            System.out.println("Given number is palindrome");
        }else{
            System.out.println("Given number is not palindrome");
        }
    }
    public static boolean isPalindrome(int n){
        int Reverse = reverse(n);
        return n==Reverse;
    }
    public static int reverse(int n){
        int reverse = 0;
        int lastNumber;
        while(n>0){
            lastNumber = n % 10;
            reverse = reverse * 10 + lastNumber;
            n = n / 10;
        }
        return reverse;
    }
}
