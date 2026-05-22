import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayOpp a1 = new ArrayOpp();
        a1.inputArray(arr);
        a1.findMax(arr);
        a1.findMin(arr);
	}
}

class ArrayOpp {
	int a[];
	public void inputArray(int arr[]) {
		a = arr;
	}

	public void findMax(int arr[]) {
		int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }

    public void findMin(int arr[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}