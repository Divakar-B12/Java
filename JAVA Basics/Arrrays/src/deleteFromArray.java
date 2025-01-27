//  Create a program to return a new array deleting a specific element.
import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array element");
        int n = input.nextInt();
        System.out.println("Enter the array element");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the number to delete from the array");
        int delete = input.nextInt();
        System.out.println("Here, your new Array list");
        int[] hosaArray = nArray(array, delete);
        arrayUtility.Display(hosaArray);

    }
    public static int[] nArray(int[] array, int delete){
        int occ = occurrenceOfElement.Occur(array,delete);
        int newSize = array.length - occ;
        int[] newArray = new int[newSize];
        int j = 0;
        for (int i=0;i<array.length;i++){
                if (array[i] != delete){
                    newArray[j] = array[i];
                    j++;
                }
            }

        return newArray;
    }

    public static void Display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +" ");
        }
    }
}
