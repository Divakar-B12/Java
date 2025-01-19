//Create a program that prints the multiplication table for given number
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print multiplication table");
        int n = input.nextInt();
        loop_1(n);
//        loop_2(n);
//        loop_3(n);

    }
    public static void loop_1(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n +" * " +i +" = " +(n*i));
        }
    }
    public static void loop_2(int n){
        int i = 1;
        while(i<=10){
            System.out.println(n +" * " +i +" = " +(n*i));
            i++;
        }
    }
    public static void loop_3(int n){
        int i = 1;
        do {
            System.out.println(n +" * " +i +" = " +(n*i));
            i++;
        }while (i<=10);
    }
}
