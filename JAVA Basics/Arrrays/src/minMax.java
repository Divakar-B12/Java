//Create a program to find the maximum and minimum element in an array.
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int minimum = min(arr);
        int maximum = max(arr);
        System.out.println(minimum + " is minimum number is given array element");
        System.out.println(maximum + " is maximum number is given array element");

    }
    public static int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
