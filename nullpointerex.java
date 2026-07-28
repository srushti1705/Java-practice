import java.util.Scanner;

public class nullpointerex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String employee = null;
		
		try {
            System.out.println("Employee name: " + employee.length());
        }
        catch (NullPointerException e) {
            System.out.println("Error: Employee name is null. Please enter a valid name.");
        }

    }
}