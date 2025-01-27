// Create a program to merge two sorted arrays.
import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of size");
        int n = input.nextInt();
        System.out.println("Enter the first array element");
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]  = input.nextInt();
        }
        System.out.println("Enter the second array element");
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }
        int[] mergeArray = mergeArray(arr1,arr2);
        System.out.println("Your merged array is");
        arrayUtility.Display(mergeArray);

    }
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] arr3 = new int[newSize];
        int i=0,j=0,k=0;
        while(i < arr1.length || j < arr2.length){
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                arr3[k] =arr1[i];
                i++;
                k++;
            }else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        return arr3;
    }
}
