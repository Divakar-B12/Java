// create a program to find number of occurrence of an element in an array.
import java.util.Scanner;

public class occurrenceOfElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array element: ");
        int n = input.nextInt();
        System.out.println("Enter the array element: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the element to find the occurrence of that element: ");
        int find = input.nextInt();
        int Occurrence = Occur(array,find);
        System.out.println("The given number " +find +" is occurred "+Occurrence +" times in the given array element");

    }
    public static int Occur(int[] array,int find){
        int Count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find){
                Count++;
            }
        }
        return Count;
    }
}
