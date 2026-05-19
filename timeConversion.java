import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in seconds: ");
		int total_sec = sc.nextInt(); 

		int hours = (total_sec / 3600);
        int minutes = (total_sec % 3600) / 60;
        int remaining_seconds = total_sec % 60;
        
        System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + remaining_seconds + " seconds");
    }
}
