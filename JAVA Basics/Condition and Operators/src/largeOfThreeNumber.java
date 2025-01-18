//Create a program that determines the greatest of the three numbers.
import java.util.Scanner;

public class largeOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is greater number");
        }else if (b>a && b>c){
            System.out.println(b+" is greater number");
        }else{
            System.out.println(c+" is greater number");
        }
    }
}
