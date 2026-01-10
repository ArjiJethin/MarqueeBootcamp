package W4Day1.Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int size = n + (n - 1);

        for (int i = 0; i < n + (n - 1); i++) {
            for (int j = 0; j <= size; j++) {
                int dist;

                // Top half (including middle)
                if (i < n) {
                    dist = (n - 1) + i;
                }
                // Bottom half
                else {
                    dist = (n - 1) + (size - i - 1);
                }

                if (j >= Math.abs((n - 1) - i) && (j <= dist)) {
                    System.out.printf("%2s", '*');
                } else {
                    System.out.printf("%2s", ' ');
                }
            }
            System.out.println();
        }
    }
}