// create a program to find the sum and average of all element in an array.
import java.util.Scanner;

public class sunAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in an array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int sumOfArray = sum(array);
        System.out.println("The sum of given array element is: "+sumOfArray);
        int average = average(array,n);
        System.out.println("The average of given array element is: "+average);
    }
    public static int sum(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
    public static int average(int[] array,int n){
        return sum(array)/n;
    }
}
