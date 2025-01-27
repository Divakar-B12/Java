// 2D array input and printing
import java.util.Scanner;

public class twoDimensionArrayPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row element: ");
        int n = input.nextInt();
        System.out.println("Enter the column element: ");
        int m = input.nextInt();
        System.out.println("Enter the two dimension array: ");
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
            System.out.println(" ");
        }
        printTwoDimensionArray(array);
    }
    public static void printTwoDimensionArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
