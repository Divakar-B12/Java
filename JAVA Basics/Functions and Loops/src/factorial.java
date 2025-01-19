//Write a function that calculates the factorial of a given numbers.
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int FactorialNo = FactorialNumber(n);
        System.out.println("The Factorial of given number is: "+FactorialNo);
    }
    public static int FactorialNumber(int n){
        int sum = 1;
        for (int i = 1; i <=n ; i++) {
            sum*=i;
        }
        return sum;
    }
}
