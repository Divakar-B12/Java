//Create a program to calculate simple interest.
//FORMULA FOR SIMPLE INTEREST - (SI = P*T*R/100).
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double P = input.nextDouble();
        System.out.println("Enter the Time in Years");
        int T = input.nextInt();
        System.out.println("Enter the rate of interest");
        double R = input.nextDouble();
        double SimpleInterest = (P*T*R)/100;
        System.out.println("Interest is: "+SimpleInterest);
    }
}
