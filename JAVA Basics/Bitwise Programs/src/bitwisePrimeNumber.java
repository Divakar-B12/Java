//Create a program to check if a given number is even or odd using bitwise operator.
import java.util.Scanner;

public class bitwisePrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int turn = n & 1;
        if (turn%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

//Other way to do check inside if((n&1)==0) is --> Even (OR) Odd
//Explanation if we do (&) with 1

//  1100 = 12
//  0001 = 1
//& 0000 --> Even

//  1011 = 11
//  0001 = 1
//& 0001 = 1 --> Odd
