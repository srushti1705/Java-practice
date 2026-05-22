import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int arr[] = new int[5];
		System.out.println("Enter array elements: ");
		for (int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	
	ArrayOpp a1 = new ArrayOpp();
	a1.inputArray(arr);
	a1.calculateSum(arr);
    }
}

class ArrayOpp {
	int a[];
	int sum = 0;

	public void inputArray(int arr[]) {
		a = arr;
	}
    
	public void calculateSum(int arr[]) {
		for (int i=0; i < a.length; i++) {
			sum = sum + a[i];
		}
	System.out.println("The sum of array elements is: " + sum);
	}
}