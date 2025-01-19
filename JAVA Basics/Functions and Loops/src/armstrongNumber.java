//Create a program to check if a number is an Armstrong number.
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        boolean isArm = isArmstrong(n);
        if (isArm){
            System.out.println(n+" is Armstrong number");
        }else {
            System.out.println(n+" is not Armstrong number");
        }
    }
    public static boolean isArmstrong(int n){
//        int count = (int)Math.log10(n)+1;
        int count = count(n);
        int ld;
        int sum = 0;
        int m = n;
        while(n>0){
            ld = n %10;
            sum = (int) (sum + Math.pow(ld, count));
            n = n / 10;
        }
        return sum==m;
    }
    public static int count(int n){
        int Count = 0;
        while(n>0){
            Count++;
            n = n / 10;
        }
        return Count;
    }
}
