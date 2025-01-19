//Create a program to print the fibonacci series up to a certain numbers.
import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n){
        if (n<0) return;
        System.out.println("0 ");
        if (n==0) return;
        System.out.println("1 ");
        int n1 = 0, n2= 1, temp =0;
        while(n1+n2<=n){
            temp = n1 +  n2;
            System.out.println(temp +" ");
            n1 = n2;
            n2 = temp;
        }
    }
}
