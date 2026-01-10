package W4Day1.IfElse2;

import java.util.Scanner;

public class TwoConsecNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        int temp = num / 2;

        if (num % 2 == 0) {
            System.out.println("Cannot find two consecutive integers that sum to " + num);
        } else {
            System.out.println(temp + " " + (temp + 1));
        }
    }
}
