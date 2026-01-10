package W4Day1.IfElse2;

import java.util.Scanner;

public class ThreeConsecNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        if (num % 3 != 0) {
            System.out.println("Cannot find three consecutive integers that sum to " + num);
        } else {
            int temp = num / 3;
            System.out.println((temp - 1) + " " + (temp) + " " + (temp + 1));
        }
    }
}