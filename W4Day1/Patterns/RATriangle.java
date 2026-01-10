package W4Day1.Patterns;

import java.util.Scanner;

public class RATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%2s", '*');
            }
            System.out.println();
        }
    }
}
