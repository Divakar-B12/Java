// Create a program to do sum and average of all elements in a 2-D array.
import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size of the array");
        int n = input.nextInt();
        System.out.println("Enter the column size of the array");
        int m = input.nextInt();
        System.out.println("Enter the array elements");
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
            System.out.println(" ");
        }
        int sum = sum(array);
        int average = average(array,n,m);
        System.out.println("Sum of given array elements are: "+sum);
        System.out.println("Average of given array elements are: "+average);

    }
    public static int sum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
        }
        return sum;
    }

    public static int average(int[][] array,int n,int m){
        int sum = sum(array);
        int size = n*m;
        return sum/size;
    }
}
