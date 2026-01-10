package W4Day1.Patterns;

import java.util.Scanner;

public class RectanglePatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%2s", '*');
            }
            System.out.println();
        }
    }
}
