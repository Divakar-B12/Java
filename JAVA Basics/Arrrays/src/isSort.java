// Create a program to find the given array element is sorted or not.
import java.util.Scanner;

public class isSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        boolean increasing = increasing(array);
        boolean decreasing = decreasing(array);
        if (increasing || decreasing){
            System.out.println("sort");
        }else{
            System.out.println("not sort");
        }
    }
    public static boolean increasing(int[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }

    public static boolean decreasing(int[] array){
        for (int i = 1; i < array.length ; i++) {
            if(array[i]>=array[i-1]){
                return false;
            }
        }
        return true;
    }
}
