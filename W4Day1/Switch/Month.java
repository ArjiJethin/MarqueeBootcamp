package W4Day1.Switch;

import java.util.*;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        System.out.print("Telugu - ");

        switch (month) {
            case 1:
                System.out.println("Maakhamu");
                break;
            case 2:
                System.out.println("Phaalgunamu");
                break;
            case 3:
                System.out.println("Chaithramu");
                break;
            case 4:
                System.out.println("Vaisaakhamu");
                break;
            case 5:
                System.out.println("Jyeshtta");
                break;
            case 6:
                System.out.println("Aashaadhamu");
                break;
            case 7:
                System.out.println("Sraavanamu");
                break;
            case 8:
                System.out.println("Bhaadhrapadamu");
                break;
            case 9:
                System.out.println("Aasveeyujamu");
                break;
            case 10:
                System.out.println("Kaarthikamu");
                break;
            case 11:
                System.out.println("Maargaseershamu");
                break;
            case 12:
                System.out.println("Pushyamu");
                break;
            default:
                System.out.println("Invalid month");
        }

        sc.close();
    }
}
