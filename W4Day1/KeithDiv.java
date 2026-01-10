package W4Day1;

import java.util.*;

public class KeithDiv {

    static boolean isKeith(int num) {
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int[] arr = new int[digits];
        temp = num;

        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;
        for (int i = 0; i < digits; i++) {
            sum += arr[i];
        }

        boolean isKeith = false;

        while (sum <= num) {
            if (sum == num) {
                isKeith = true;
                break;
            }

            for (int i = 0; i < digits - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[digits - 1] = sum;

            sum = 0;
            for (int i = 0; i < digits; i++) {
                sum += arr[i];
            }
        }

        return isKeith;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            if (isKeith(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
