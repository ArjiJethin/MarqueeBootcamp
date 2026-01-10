package W4Day1.IfElse1;

import java.util.Scanner;

public class Siblings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sib1 = sc.nextLine();
        String sib2 = sc.nextLine();
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();

        sc.close();

        if (age1 > age2) {
            System.out.printf("%s is older than %s\n", sib1, sib2);
        } else if (age2 > age1) {
            System.out.printf("%s is older than %s\n", sib2, sib1);
        } else {
            System.out.printf("%s and %s are of the same age\n", sib1, sib2);
        }
    }
}
