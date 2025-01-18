//Create a program that categorize a person into different age groups
//Child-->Below 13 age
//Teen-->Below 20 age
//Adult-->Below 60 age
//Senior -->Above 60+ age
import java.util.Scanner;

public class ageGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if (age<0) {
            System.out.println("Enter valid age");
        }
        if (age<13){
            System.out.println("You are Child");
        }else if(age<20){
            System.out.println("You are Teenager");
        } else if (age<60) {
            System.out.println("You are adult");
        } else if (age>=60 && age<=120) {
            System.out.println("You are senior");
        }else {
            System.out.println("RIP");
        }

    }
}
