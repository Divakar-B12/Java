import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        pattern_2(n);
    }
    public static void pattern_1(int n){
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern_2(int n){
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
