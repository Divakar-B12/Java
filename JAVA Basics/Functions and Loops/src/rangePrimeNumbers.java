//Print the N prime number
import java.util.Scanner;

public class rangePrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        for (int i = 2; i <n; i++) {
            if (primeNos(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static boolean primeNos(int n){
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
