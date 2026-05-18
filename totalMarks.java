import java.util.Scanner;

public class totalMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter marks of 1st subject: "); 
		float first = sc.nextFloat(); 

		System.out.println("Enter marks of 2nd subject: "); 
		float second = sc.nextFloat(); 

		System.out.println("Enter marks of 3rd subject: "); 
		float third = sc.nextFloat(); 

		System.out.println("Enter marks of 4th subject: "); 
		float fourth = sc.nextFloat(); 

		System.out.println("Enter marks of 5th subject: "); 
		float fifth = sc.nextFloat(); 
		
		float total_marks = first + second + third + fourth + fifth; 
		
		float percentage = (float) ((total_marks / 500.0) * 100);

		System.out.println("Total marks: " + total_marks);
		System.out.println("Percentage: " + percentage);
	}
}