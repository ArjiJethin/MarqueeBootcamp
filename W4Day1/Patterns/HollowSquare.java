package W4Day1.Patterns;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.printf("%2s", '*');
                } else {
                    System.out.printf("%2s", ' ');
                }
            }
            System.out.println();
        }
    }
}
