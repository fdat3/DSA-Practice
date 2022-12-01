package Practice;
import java.util.*;
import java.io.*;

public class sumOfSmallestandBiggest {
	public static int findNumber(int arr[], int n, int m) {	
		int sumSmallest = 0, sumBiggest = 0;
		
		for(int i = 0; i < n - m; i++) 
		{
			sumSmallest += arr[i];
			sumBiggest += arr[n - 1 -i];
		}
		return sumBiggest - sumSmallest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào n: ");
		n = sc.nextInt();
		System.out.println("Nhập vào số phần tử: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);	
		System.out.println("Nhập vào m: ");
		int m = sc.nextInt();
	
		System.out.println("Kết quả là: " + findNumber(arr, n , m ));
	}
}
