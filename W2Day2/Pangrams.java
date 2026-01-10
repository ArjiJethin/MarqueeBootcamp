package W2Day2;

import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        sc.close();

        str = str.toLowerCase();

        int arr[] = new int[256];
        int flag = 0;

        for (char ch : str.toCharArray()) {
            arr[ch] += 1;
        }

        for (int i = 97; i <= 122; i++) {
            arr[i] -= 1;
            if (arr[i] < 0) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.print("Not Pangrams");
        } else {
            System.out.print("Pangrams");
        }

    }

}
