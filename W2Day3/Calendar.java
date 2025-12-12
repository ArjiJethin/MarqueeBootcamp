package W2Day3;

import java.util.*;

public class Calendar {

    static int get_month_no(String month) {
        switch (month) {
            case "jan":
                return 1;
            case "feb":
                return 2;
            case "mar":
                return 3;
            case "apr":
                return 4;
            case "may":
                return 5;
            case "jun":
                return 6;
            case "jul":
                return 7;
            case "aug":
                return 8;
            case "sep":
                return 9;
            case "oct":
                return 10;
            case "nov":
                return 11;
            case "dec":
                return 12;
            default:
                return -1;
        }
    }

    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static int dayofweek(int d, int m, int y) {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (m < 3)
            y--;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        month = month.toLowerCase();

        int[] tot_dates_month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            tot_dates_month[2] = 29;
        }

        sc.close();

        int month_num;
        if (Character.isDigit(month.charAt(0))) {
            month_num = Integer.parseInt(month);
        } else {
            month_num = get_month_no(month);
        }

        String title = month.toUpperCase() + " " + String.valueOf(year);

        clearConsole();

        System.out.printf("%24s", title);
        System.out.println();

        System.out.printf("%5s %5s %5s %5s %5s %5s %5s\n", "  Sun", "  Mon", "  Tue", "  Wed", "  Thu", "  Fri",
                "  Sat");

        int start_day = dayofweek(1, month_num, year);

        // Blank spaces for the first week
        for (int i = 0; i < start_day; i++) {
            System.out.printf("%6s", "");
        }

        // Print all dates
        for (int date = 1; date <= tot_dates_month[month_num]; date++) {
            System.out.printf("%6d", date);

            // Check if we need a new line (end of week)
            if ((start_day + date) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();

    }
}
