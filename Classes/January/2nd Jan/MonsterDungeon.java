import java.util.*;

public class MonsterDungeon {

    static void SelectionSort(int[] ExpArray, int[] BPArray, int left, int right) {
        for (int i = left; i < right; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= right; j++) {
                if (ExpArray[j] < ExpArray[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap ExpArray
            int tempExp = ExpArray[i];
            ExpArray[i] = ExpArray[minIndex];
            ExpArray[minIndex] = tempExp;

            // Swap BPArray to maintain correspondence
            int tempBP = BPArray[i];
            BPArray[i] = BPArray[minIndex];
            BPArray[minIndex] = tempBP;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nom, initial_exp;
        nom = sc.nextInt();
        initial_exp = sc.nextInt();

        int[] ExpArray = new int[nom];
        int[] BPArray = new int[nom];

        for (int i = 0; i < nom; i++) {
            ExpArray[i] = sc.nextInt();
        }

        for (int i = 0; i < nom; i++) {
            BPArray[i] = sc.nextInt();
        }

        sc.close();

        SelectionSort(ExpArray, BPArray, 0, nom - 1);

        int slayed = 0;
        // int prev = -1, curr = 0;
        int current_exp = initial_exp;

        // while (prev != curr) {
        // prev = slayed;
        for (int i = 0; i < nom; i++) {
            if (current_exp >= ExpArray[i] && ExpArray[i] != -1) {
                current_exp += BPArray[i];
                ExpArray[i] = -1;
                slayed++;
            }
        }
        // curr = slayed;
        // }

        System.out.printf("\nMonsters Slayed: %d", slayed);

    }

}
