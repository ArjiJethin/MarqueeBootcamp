package W3Day6;

import java.util.*;

public class DecToRom {

    static String decimaltoroman(int n) {
        StringBuilder roman = new StringBuilder();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        String romanNumeral = decimaltoroman(n);

        System.out.println(romanNumeral);
    }
}
