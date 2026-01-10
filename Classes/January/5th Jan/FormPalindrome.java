import java.util.*;

public class FormPalindrome {

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        sc.close();

        char[] str_array = str.toCharArray();

        int max_index = 0, index = 0;

        StringBuilder check_str = new StringBuilder();

        for (char ch : str_array) {
            index += 1;
            check_str.append(ch);
            if (isPalindrome(check_str.toString())) {
                max_index = index;
            }
        }

        StringBuilder addon = new StringBuilder();
        addon = addon.append(str.substring(max_index));
        addon = addon.reverse();
        String result = addon.toString() + str;

        System.out.println(result);
    }
}
