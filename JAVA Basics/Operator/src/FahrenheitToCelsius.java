// Create a program to convert Fahrenheit To Celsius
//FORMULA FOR convert Fahrenheit To Celsius - (C = (F-32) * 5 /9).
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit");
        int F = input.nextInt();
        double Celsius = (double)(F-32) * 5 /9;
        System.out.println("The celsius is: "+Celsius);
    }
}
