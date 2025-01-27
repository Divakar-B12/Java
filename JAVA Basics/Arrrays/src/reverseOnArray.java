// create a program to reverse an array
import java.util.Scanner;

public class reverseOnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array element");
        int n = input.nextInt();
        System.out.println("Enter the array element");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        reverseArray(array);
        System.out.println("Your reverse array");
        arrayUtility.Display(array);
    }

    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int swap = array[i];
            array[i] = array[(array.length -1) -i];
            array[(array.length -1)-i] = swap;
        }
    }

}
