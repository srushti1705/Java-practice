import java.util.Scanner;

public class daysOfWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day number (1-7): ");
        int dayNumber = sc.nextInt();

        String day;

        switch (dayNumber) {

            case 1:
                day = "Weekend";
                break;

            case 2:
            case 3:
            case 4:
            case 5:
                day = "Weekday";
                break;

            case 6:
            case 7:
                day = "Weekend";
                break;

            default:
                day = "Invalid day number";
        }

        System.out.println("Day: " + day);

        sc.close();
    }
}