package W4Day1.IfElse1;

import java.util.Scanner;

public class Parents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String Dad = sc.nextLine();
        String Mom = sc.nextLine();

        sc.close();

        System.out.printf("My name is %s and I am proud child of %s and %s\n", name, Dad, Mom);

    }
}
