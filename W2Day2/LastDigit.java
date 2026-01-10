package W2Day2;

import java.util.*;

public class LastDigit {
    static int power_digit_retriever(long no, long pow) {
        int copy_no = (int) (no % 10);

        int copy_pow = (int) ((pow % 4));
        if (copy_pow == 0)
            copy_pow = 3;

        return LastDigit_finder(copy_no, copy_pow);
    }

    static int LastDigit_finder(int no, int pow) {
        int arr[][] = { { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 2, 4, 8, 6 }, { 3, 9, 7, 1 }, { 4, 6, 4, 6 }, { 5, 5, 5, 5 },
                { 6, 6, 6, 6 }, { 7, 9, 3, 1 }, { 8, 4, 2, 6 }, { 9, 1, 9, 9 } };

        return arr[no][pow];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long pow = sc.nextLong();

        sc.close();

        int result = power_digit_retriever(n, pow);

        System.out.print(result);
    }
}
