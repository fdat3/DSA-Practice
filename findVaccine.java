package Practice;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class findVaccine {
	public static void checkItem( int[] vaccine, int[] virus, int[] arr) 
	{
		//Sắp xếp lại dãy số
		Arrays.sort(arr);
		Arrays.sort(vaccine);
		Arrays.sort(virus);
		
		
		
		for(int i = 0; i< arr.length; i++) { 
			if(vaccine[i] <= virus[i]/3) {
				System.out.print("NO ");
			} else {
				System.out.print("YES ");
			}
		}
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        // khởi tạo mảng arr
        int[] arr = new int[n];
		
		System.out.print("Nhập vào số lượng vaccine");
		int[] vaccine = new int[n];	
		for(int i = 0; i < n; i++) 
		{
			vaccine[i] = sc.nextInt();
		}
		System.out.print("Nhập vào số lượng virus");
		int[] virus = new int[n];	
		for(int i = 0; i < n; i++) 
		{
			virus[i] = sc.nextInt();
		}
		checkItem(vaccine, virus, arr);
	}

}
