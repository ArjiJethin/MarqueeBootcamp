package W4Day1.IfElse1;

import java.util.*;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.out.printf("I am %d Years Old and I am Eligible to Vote", age);
        } else {
            System.out.printf("I am %d Years Old and I am Not Eligible to Vote", age);
        }

    }
}
