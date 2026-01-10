import java.util.*;

public class MovingApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baskets = sc.nextInt();
        int[] appleBasket = new int[baskets];

        while (true) {
            int i = sc.nextInt();
            if (i == -1) {
                break;
            }
            appleBasket[i] = sc.nextInt();
        }
        sc.close();

        int totalApples = 0;
        for (int apples : appleBasket) {
            totalApples += apples;
        }

        int averageApples = totalApples / baskets;
        int moves = 0;

        for (int apples : appleBasket) {
            if (apples > averageApples) {
                moves += apples - averageApples;
            }
        }

        System.out.println(moves);
    }
}