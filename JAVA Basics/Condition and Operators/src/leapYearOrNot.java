//Create a program that determines if a given year is a leap year
//
import java.util.Scanner;

public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = input.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println(year+" is leap year");
        }else{
            System.out.println(year+" is not leap year");
        }
    }
}
