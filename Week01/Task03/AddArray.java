import java.util.Scanner;
import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
	Arrays.sort(arr);
	for(int e: arr){
	    sum += e;
	}
        System.out.println("The sum of the elements of the sorted array is: " + sum);
    }
}
