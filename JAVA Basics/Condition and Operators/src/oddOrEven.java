//Create a program that determines if a number id Odd or Even.

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if (n%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
