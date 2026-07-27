import java.util.Scanner;

public class removeDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.println("Enter elements of an Array: ");
		for(int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
        System.out.println("Array without duplicates: ");
        for(int i=0; i < arr.length; i++) {
            boolean duplicate = false;
            for(int j=0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
		
        if(!duplicate) {
            System.out.print(arr[i] + " ");
        }
    }
}
}