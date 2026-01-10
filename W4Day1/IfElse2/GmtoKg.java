package W4Day1.IfElse2;

import java.util.*;

public class GmtoKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grams = sc.nextInt();
        sc.close();

        double kg = grams / 1000;
        double grams_remaining = grams % 1000;

        if (kg > 0) {
            System.out.println(grams + " grams is " + (int) kg + " kilograms and " + grams_remaining + " grams.");
            return;
        }

        System.out.println(grams + " grams is " + kg + " kilograms and " + grams_remaining + " grams.");

    }
}
