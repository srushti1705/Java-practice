import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int arr[] = new int[5];
		
		System.out.println("Enter array elements: ");
		
		for (int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayOpp a1 = new ArrayOpp();
		a1.inputArray(arr);
		a1.findAverage(arr);
	}
}

class ArrayOpp {
	int a[];
	int sum = 0;
	double average = 0;

	public void inputArray(int arr[]) {
		a = arr;
	}

	public void findAverage(int arr[]) {
		for (int i=0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		average = sum / 5;
        System.out.println("The average of array elements is: " + average);
	}
}
