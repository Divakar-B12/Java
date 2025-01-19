// Print the odd numbers between 200 to 25 (reverse order)
//import java.util.Scanner;

public class printNumbersInReverseOrder {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = input.nextInt();
        for (int i=200;i>=25;i--){
            if(i%2!=0){
                System.out.print(i +" ");
            }

        }
    }
}
