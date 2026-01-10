package W2Day2;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();

        int arr[] = new int[256];
        int flag = 0;

        for (char ch : str1.toCharArray()) {
            arr[ch] += 1;
        }

        String str2 = sc.nextLine();
        str2 = str2.toLowerCase();

        sc.close();

        for (char ch : str2.toCharArray()) {
            arr[ch] -= 1;
            if (arr[ch] == -1) {
                flag = 1;
            }
        }

        if (flag != 1) {
            System.out.print("Anagrams");
        } else {
            System.out.print("Not Anagrams");
        }
    }
}
