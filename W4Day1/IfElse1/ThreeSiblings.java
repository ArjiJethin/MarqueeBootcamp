package W4Day1.IfElse1;

import java.util.*;

public class ThreeSiblings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sib1 = sc.nextLine();
        String sib2 = sc.nextLine();
        String sib3 = sc.nextLine();
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();

        sc.close();

        if (age1 >= age2 && age1 >= age3) {
            if (age2 >= age3) {
                System.out.printf("%s is the oldest, %s is the middle, and %s is the youngest\n", sib1, sib2, sib3);
            } else {
                System.out.printf("%s is the oldest, %s is the middle, and %s is the youngest\n", sib1, sib3, sib2);
            }
        } else if (age2 >= age1 && age2 >= age3) {
            if (age1 >= age3) {
                System.out.printf("%s is the oldest, %s is the middle, and %s is the youngest\n", sib2, sib1, sib3);
            } else {
                System.out.printf("%s is the oldest, %s is the middle, and %s is the youngest\n", sib2, sib3, sib1);
            }
        } else {
            if (age1 >= age2) {
                System.out.printf("%s is the oldest, %s is the middle, and %s is the youngest\n", sib3, sib1, sib2);
            } else {
                System.out.printf("%s is the oldest, %s is the middle, and %s is the youngest\n", sib3, sib2, sib1);
            }
        }
    }
}
