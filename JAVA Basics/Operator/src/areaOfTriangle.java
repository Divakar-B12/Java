//Create a program to calculate the area of a triangle
//FORMULA OF AREA OF TRIANGLE - (0.5*B*H)
import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base");
        int Base = input.nextInt();
        System.out.println("Enter the Height");
        int Height = input.nextInt();
        int Area = (int)(0.5 * Base * Height);
        System.out.println("The area of triangle is: "+Area+" square units");
    }
}
