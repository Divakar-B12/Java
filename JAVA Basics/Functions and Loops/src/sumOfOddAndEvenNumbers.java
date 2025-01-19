//Create a program to sum of all odd and even number from 1 to a Specified number N
import java.util.Scanner;

public class sumOfOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int OddSum = OddNumbers(n);
        System.out.println("Sum of all Odd Numbers till N "+OddSum);
        int EvenSum = EvenNumber(n);
        System.out.println("Sum of all Even numbers till N "+EvenSum);
    }
    public static int OddNumbers(int n){
        int sum = 0;
        for (int i = 1; i <=n ; i+=2) {
            sum += i;
        }
        return sum;
    }
    public static int EvenNumber(int n){
        int sum = 0;
        int i = 0;
        while(i<n){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
