package W4Day1.IfElse1;

import java.util.*;

public class ThreeInternalMarks {
    public static void main(String[] args) {
        int marks1, marks2, marks3;
        Scanner sc = new Scanner(System.in);
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        sc.close();

        double avg;

        if (marks1 > marks2 && marks1 > marks3) {
            if (marks2 > marks3) {
                avg = Math.ceil((marks1 + marks2) / 2.0);
                System.out.println((int) avg);
            } else {
                avg = Math.ceil((marks1 + marks3) / 2.0);
                System.out.println((int) avg);
            }
        } else if (marks2 > marks1 && marks2 > marks3) {
            if (marks1 > marks3) {
                avg = Math.ceil((marks2 + marks1) / 2.0);
                System.out.println((int) avg);
            } else {
                avg = Math.ceil((marks2 + marks3) / 2.0);
                System.out.println((int) avg);
            }
        } else {
            if (marks1 > marks2) {
                avg = Math.ceil((marks3 + marks1) / 2.0);
                System.out.println((int) avg);
            } else {
                avg = Math.ceil((marks3 + marks2) / 2.0);
                System.out.println((int) avg);
            }
        }
    }
}