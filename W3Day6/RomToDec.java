package W3Day6;

import java.util.*;

public class RomToDec {

    static int RomanToDecimal(String roman) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int result = 0;
        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        sc.close();

        RomanToDecimal(roman);
    }
}
