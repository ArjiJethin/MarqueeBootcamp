package W2Day2;

import java.util.*;

public class BaseConversions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(
                "1)Binary to Octal\n2)Decimal to binary\n3)Octal to Binary\n4)Decimal to Octal\nEnter your Choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                long binary = sc.nextLong();
                long decimal1 = 0;
                int pow = 0;

                while (binary != 0) {
                    decimal1 += (binary % 10) * (1L << pow);
                    pow++;
                    binary /= 10;
                }

                int place1 = 1;
                long result1 = 0;
                while (decimal1 != 0) {
                    result1 += (decimal1 % 8) * place1;
                    place1 *= 10;
                    decimal1 /= 8;
                }
                System.out.print(result1);

                break;

            case 2:
                long decimal2 = sc.nextLong();
                int place2 = 1;
                long result2 = 0;
                while (decimal2 != 0) {
                    result2 += (decimal2 % 2) * place2;
                    place2 *= 10;
                    decimal2 /= 2;
                }
                System.out.print(result2);
                break;

            case 3:
                long octal = sc.nextLong();
                long decimal3 = 0;
                long result3 = 0;
                int pow1 = 0;

                while (octal != 0) {
                    decimal3 += (octal % 10) * (1L << (3 * (pow1)));
                    pow1++;
                    octal /= 10;
                }

                int place3 = 1;
                while (decimal3 != 0) {
                    result3 += (decimal3 % 2) * place3;
                    place3 *= 10;
                    decimal3 /= 2;
                }
                System.out.print(result3);
                break;

            case 4:
                long decimal4 = sc.nextLong();
                int place4 = 1;
                long result4 = 0;
                while (decimal4 != 0) {
                    result4 += (decimal4 % 8) * place4;
                    place4 *= 10;
                    decimal4 /= 8;
                }
                System.out.print(result4);

                break;

        }

        sc.close();

    }

}
