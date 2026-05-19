import java.util.Scanner;

public class remark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter grade (A, B, C, D, F): ");
        char grade = sc.next().charAt(0);

        String remark;

        switch (grade) {
            case 'A':
                remark = "Excellent";
                break;
            case 'B':
                remark = "Good";
                break;
            case 'C':
                remark = "Average";
                break;
            case 'D':
                remark = "Below Average";
                break;
            case 'F':
                remark = "Fail";
                break;
            default:
                remark = "Invalid grade";
        }
        System.out.println("Remark: " + remark);
    }
}
