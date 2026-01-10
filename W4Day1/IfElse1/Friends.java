package W4Day1.IfElse1;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String friend1 = sc.nextLine();
        String friend2 = sc.nextLine();

        sc.close();

        System.out.printf("My name is %s and my best friends are %s and %s\n", name, friend1, friend2);
    }
}
