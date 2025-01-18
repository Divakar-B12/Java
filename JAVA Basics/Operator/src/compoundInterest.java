//Create a program to calculate Compound interest.
//FORMULA FOR COMPOUND INTEREST - (CP=P(1+R/100)t)
import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int P = input.nextInt();
        System.out.println("Enter Rate of interest");
        float R = input.nextFloat();
        System.out.println("Enter Time in year");
        int t = input.nextInt();
        double CP = P * Math.pow((1+R / 100),t);
        System.out.println("The compound interest is "+CP);
    }
}
