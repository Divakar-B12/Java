// Create a program to search an element in a 2-D array.
import java.util.Scanner;

public class searchElementInTwoDimensionArray {
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
        System.out.println("Enter the number to search in the array");
        int search = input.nextInt();
        boolean isFound = searchElement(array,search);
        if (isFound){
            System.out.println("Given number is found in the array");
        }else{
            System.out.println("Given number is not found in the array");
        }

    }
    public static boolean searchElement(int[][] array,int search){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == search){
                    return true;
                }
            }
        }
        return false;
    }
}
