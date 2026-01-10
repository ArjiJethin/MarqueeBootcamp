package W4Day1;

import java.util.*;

public class KeithNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int num1 = num % 10;
        int n = num / 10;

        int num2 = n % 10;
        n /= 10;

        int num3 = n % 10;

        int num4 = num1 + num2 + num3;

        int flag = 0;

        while (num4 <= num) {
            if (num4 == num) {
                flag = 1;
                break;
            }
            num1 = num2;
            num2 = num3;
            num3 = num4;
            num4 = num1 + num2 + num3;
        }

        System.out.println(flag == 1 ? "Its a Keith Number" : "Its not a Keith Number");

    }
}
