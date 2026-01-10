import java.util.Scanner;
// 14.41
// 15.00
import java.util.Random;

class insertion {
	public static void print(int[] arr) {
		int arr_ind;
		for (arr_ind = 0; arr_ind < arr.length; arr_ind++)
			System.out.printf("%03d ", arr[arr_ind]);
		System.out.println();
	}

	public static void insertionSort(int[] arr) {
		int unsorted;
		int shifter;
		int temp;
		for (unsorted = 1; unsorted < arr.length; unsorted++) {
			for (shifter = unsorted; shifter > 0 && arr[shifter] < arr[shifter - 1]; shifter -= 1) {
				temp = arr[shifter];
				arr[shifter] = arr[shifter - 1];
				arr[shifter - 1] = temp;
			}
		}

	}

	public static void main(String[] parameters) {
		int noe;
		String sort_name = "Insertion";
		Scanner kbrd = new Scanner(System.in);
		kbrd.close();
		noe = kbrd.nextInt();
		int[] arr = new int[noe];
		Random rnd = new Random();
		int arr_ind;
		for (arr_ind = 0; arr_ind < noe; arr_ind++) {
			arr[arr_ind] = rnd.nextInt() % 1000;
		}
		long start_time = System.currentTimeMillis();
		// int [] arr = {10,20,30,40,50,60,70,80,90,42,14,15,27,88,99,33,46,21};
		// print ( arr );
		insertionSort(arr);
		// print( arr );
		long stop_time = System.currentTimeMillis();
		double time_taken = (stop_time - start_time) / 1000.0;
		System.out.printf("%s Algo %d Elements Duration = %.3f", sort_name, noe, time_taken);
	}
}