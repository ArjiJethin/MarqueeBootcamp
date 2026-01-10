import java.util.*;

public class NSGNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int size = (int) (Math.log10(n) + 1);

        int[] arr = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n = n / 10;
        }

        int end_pointer = size - 2;

        // Find the rightmost digit that is smaller than the digit next to it
        while (end_pointer >= 0 && arr[end_pointer] >= arr[end_pointer + 1]) {
            end_pointer--;
        }

        // If no such digit is found, this is the largest permutation
        if (end_pointer < 0) {
            System.out.println("No next greater number");
            return;
        }

        int next_min = Integer.MAX_VALUE;
        int index = -1;

        // Find the smallest digit greater than arr[end_pointer] to its right
        for (int i = end_pointer + 1; i < arr.length; i++) {
            if (arr[i] > arr[end_pointer] && arr[i] < next_min) {
                next_min = arr[i];
                index = i;
            }
        }

        // Swap
        int temp = arr[end_pointer];
        arr[end_pointer] = arr[index];
        arr[index] = temp;

        // Sort the digits after end_pointer in ascending order
        Arrays.sort(arr, end_pointer + 1, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}