import java.util.Scanner;

public class weekEndOrWeekDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Day");
        String Day = input.nextLine();
        switch (Day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It's WeekDays");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Yah, It's an WeekEnd");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
