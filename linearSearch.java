package Practice;
import java.util.Scanner;

public class linearSearch {
	
	public static int search(int[] arr, int x, int n) 
	{
		for(int i = 0, length = arr.length; i < length; i++) 
		{
			if(arr[i] == x) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		
		do 
		{	
				System.out.print("Nhập vào độ dài của mảng: ");
				n = sc.nextInt();
		} while(n <= 0);
		
		System.out.print("Nhập vào " + n + " phần tử trong mảng: ");
		int[] arr = new int[n];	
		for(int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Nhập vào phần tử cần tìm: ");
		int x = sc.nextInt();
		int result = search(arr, x, n);
		
		if(result == -1)
			System.out.print("Không thể tìm thấy " + x);
		else 
			System.out.print("Phần tử " + x + " nằm ở vị trí thứ " + result + " trong mảng ");
	}
}
