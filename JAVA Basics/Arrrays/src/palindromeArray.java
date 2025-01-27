// Create a program to check is the array is palindrome or not.
import java.util.Scanner;

public class palindromeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of array element");
        int n = input.nextInt();
        System.out.println("Enter the array element");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        boolean isPalindrome = reverseArray(array);
        if (isPalindrome){
            System.out.println("Given array element is palindrome");
        }else{
            System.out.println("Given array element is not palindrome");
        }

    }

    public static boolean reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length -1 -i]){
                return false;
            }
        }
        return true;
    }
}
