package W4Day1.IfElse2;

import java.util.*;

public class CurrencyCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inr = sc.nextDouble();
        double converter = sc.nextDouble();
        sc.close();

        double converted_amount = inr / converter;

        System.out.printf("Converted amount: %.2f", converted_amount);
    }

}
