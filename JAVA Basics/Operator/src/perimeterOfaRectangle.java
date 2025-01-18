// Creating a program to calculate Perimeter of a rectangle.
// FORMULA FOR PERIMETER OF RECTANGLE -(P=A+B+C+D) or (P = (L+W)*2)

import java.util.Scanner;

public class perimeterOfaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length");
        int L = input.nextInt();
        System.out.println("Enter the Width");
        int W = input.nextInt();
        int Perimeter = (L +W) * 2 ;
        System.out.println("The perimeter of rectangle is: "+Perimeter+"ft");
    }
}
