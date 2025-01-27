// 1D array input and printing
import java.util.Scanner;

public class oneDimensionArrayPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i=0;i<array.length;i++){
            array[i] = input.nextInt();
        }
        System.out.println("These are the array element you entered is");
        for (int j : array) {
            System.out.print(j + " ");
        }
        // Printing Array elements using for loop
//        System.out.println(" ");
//        for (int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
    }
}
