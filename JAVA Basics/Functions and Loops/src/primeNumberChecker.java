//Create a program to check whether a given number is prime.
import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check the number is prime number or not: ");
        int n = input.nextInt();
        boolean isPrimeNumbers = isPrime(n);
        if (isPrimeNumbers){
            System.out.println("Given number "+n +" is prime number");
        }else{
            System.out.println("Given number "+n +" is not prime number");
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
