package W4Day1.Patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int size = n + (n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= size; j++) {
                if (j >= (n - 1) - i && j <= (n - 1) + i) {
                    System.out.printf("%2s", '*');
                } else {
                    System.out.printf("%2s", ' ');
                }
            }
            System.out.println();
        }
    }
}
