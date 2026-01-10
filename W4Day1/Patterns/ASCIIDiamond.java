package W4Day1.Patterns;

import java.util.*;

public class ASCIIDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int ch = 65;
        int size = n + (n - 1);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (ch > 90) {
                    ch = 65;
                }

                int dist;
                if (i < n) {
                    dist = (n - 1) + i;
                } else {
                    dist = (n - 1) + (size - i - 1);
                }

                if (j >= Math.abs((n - 1) - i) && j <= dist) {
                    System.out.printf("%2c", ch++);
                } else {
                    System.out.printf("%2s", ' ');
                }
            }
            System.out.println();
        }
    }
}
