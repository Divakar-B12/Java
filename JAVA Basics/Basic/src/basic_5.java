//5. Create a program to input name of the person and greet him/her with "Good Morning NAME have a nice day!"
import java.util.Scanner;
public class basic_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String NAME = input.nextLine();
        System.out.println("Good Morning "+NAME +" Have a nice day!");
    }
}
