package Practice;
import java.util.*;

public class week1_DSA {

	// Top-down design || linearSearch
	public static int lS(int[] arr, int x, int n) {
		for (int i = 0, l = arr.length; i < l; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// Bottom-up design || binarySearch
	public static int bS(int[] arr, int left, int right, int target) {
		while (right > left) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target)
				return mid;

			if (arr[mid] > target) {
				return bS(arr, left, mid - 1, target);
			} else {
				return bS(arr, mid + 1, right, target);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		int chon = 0;

		do {
			System.out.println("Nhập vào độ dài của mảng: ");
			n = sc.nextInt();

			System.out.println("Nhập vào " + n + " phần tử có trong mảng:");
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("Nhập vào phần tử cần tìm kiếm: ");
			int x = sc.nextInt();
			System.out.println("Lựa chọn phương thức tìm kiếm tìm kiếm:\n1.Top-down design \n2.Bottom-up design \n");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("--------Tìm kiếm theo phương thức top-down design------");
				int result = lS(arr, x, n);
				if (result == -1)
					System.out.println("Không tìm thấy phần tử " + x);
				else
					System.out.println("Phần tử " + x + " nằm ở vị trí " + result);
				System.out.println(
						"Thời gian chương trình thực hiện thuật toán (milisecond): \n" + System.currentTimeMillis());
				break;
			case 2:
				System.out.println("--------Tìm kiếm theo phương thức bottom-up design------");
				int resultBS = bS(arr, 0, arr.length - 1, x);

				if (resultBS == -1)
					System.out.println("Không tìm thấy phần tử " + x);
				else
					System.out.println("Phần tử " + x + " nằm ở vị trí " + resultBS);
				System.out.println(
						"Thời gian chương trình thực hiện thuật toán (milisecond): \n" + System.currentTimeMillis());
				break;
			}
		} while (chon < 3);

	}

}
