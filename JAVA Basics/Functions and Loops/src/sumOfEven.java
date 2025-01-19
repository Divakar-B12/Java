import java.util.Scanner;

//Print the sum of the even number between, 40 to 80.
public class sumOfEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            if (i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of even number is: "+sum);
    }
}
