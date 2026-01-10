package W4Day1.IfElse1;

import java.util.*;

public class FourInternalMarks {
    public static void main(String[] args) {
        int marks1, marks2, marks3, marks4;
        Scanner sc = new Scanner(System.in);
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        marks4 = sc.nextInt();
        sc.close();

        double avg;

        // Find the minimum mark (to exclude it)
        if (marks1 <= marks2 && marks1 <= marks3 && marks1 <= marks4) {
            // marks1 is minimum, take marks2, marks3, marks4
            avg = Math.floor((marks2 + marks3 + marks4) / 3.0);
            System.out.println((int) avg);
        } else if (marks2 <= marks1 && marks2 <= marks3 && marks2 <= marks4) {
            // marks2 is minimum, take marks1, marks3, marks4
            avg = Math.floor((marks1 + marks3 + marks4) / 3.0);
            System.out.println((int) avg);
        } else if (marks3 <= marks1 && marks3 <= marks2 && marks3 <= marks4) {
            // marks3 is minimum, take marks1, marks2, marks4
            avg = Math.floor((marks1 + marks2 + marks4) / 3.0);
            System.out.println((int) avg);
        } else {
            // marks4 is minimum, take marks1, marks2, marks3
            avg = Math.floor((marks1 + marks2 + marks3) / 3.0);
            System.out.println((int) avg);
        }
    }
}