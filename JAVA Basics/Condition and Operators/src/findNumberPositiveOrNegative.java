

//Create a program that determines if a number is positive, negative, or Zero.
import java.util.Scanner;
public class findNumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        } else if (n<0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("Number is equal to zero");
        }
    }
}
