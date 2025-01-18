//Create a program that calculates grades based on marks
//A-->above 90%
//B-->above 75%
//C-->above 60%
//D-->above 30%
//Fail-->Below 30%
import java.util.Scanner;

public class studentPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Elective Marks");
        int E1 = input.nextInt();
        System.out.println("Enter 2nd Elective Marks");
        int E2 = input.nextInt();
        System.out.println("Enter the Physics Marks");
        int P = input.nextInt();
        System.out.println("Enter the Chemistry Marks");
        int C = input.nextInt();
        System.out.println("Enter the Mathematics Marks");
        int M = input.nextInt();
        System.out.println("Enter the Computer Science (or) Biology Marks");
        int CorB = input.nextInt();
        int TotalSecuredMarks = E1+E2+P+C+M+CorB;
        int TotalMarks = 600;
        float Percentage = ((float) TotalSecuredMarks/TotalMarks) * 100;
        if (Percentage>90.0){
            System.out.println("You got A+ Grade,with "+Percentage +"%");
        }else if (Percentage>75.0){
            System.out.println("You got B+ Grade,with "+Percentage +"%");
        } else if (Percentage>60.0) {
            System.out.println("You got C+ Grade,with "+Percentage +"%");
        }else if(Percentage>30.0){
            System.out.println("You got D+ Grade,with "+Percentage +"%");
        }
        else {
            System.out.println("You are Fail with "+Percentage +"% Better luck next time");
        }
    }
}
